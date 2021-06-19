package com.kozznation.eventManagement.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.kozznation.eventManagement.dao.MovieDto;
import com.kozznation.eventManagement.model.MoviePage;

@Repository
public class MovieDaoRepository {

	private final EntityManager em;
	private final CriteriaBuilder cb;    

    public MovieDaoRepository(EntityManager em) {
		this.em = em;
		this.cb = em.getCriteriaBuilder();
	}



	public Page<MovieDto> findMovieSuggestionsByName(String title, String directorName, MoviePage moviePage) {
        
        CriteriaQuery<MovieDto> cq = cb.createQuery(MovieDto.class);

        Root<MovieDto> movie = cq.from(MovieDto.class);	
        Predicate predicate = getPredicate(title, directorName, movie); 
        
        cq.where(predicate);
        cq.orderBy(cb.asc(movie.get(moviePage.getSortBy())));
        
        TypedQuery<MovieDto> query = em.createQuery(cq);
        query.setFirstResult(moviePage.getPageNumber() * moviePage.getPageSize());
        query.setMaxResults(moviePage.getPageSize());
        
        Pageable pageable = getPageable(moviePage);
        
        long movieCount = getMoviesCount(predicate);
        
        

        return new PageImpl<>(query.getResultList(), pageable, movieCount);
        
//        return query.getResultList(moviePage);
    }







	private Predicate getPredicate(String title, String directorName, Root<MovieDto> movie) {
		
		List<Predicate> predicates = new ArrayList<>();
        
        if (title != null) {
            predicates.add(cb.like(cb.lower(movie.get("title")), "%" + title.toLowerCase() + "%"));
        }
        if (directorName != null) {
            predicates.add(cb.like(cb.lower(movie.get("director")), "%" + directorName.toLowerCase() + "%"));
        }
    
		return cb.or(predicates.toArray(new Predicate[0]));
	}



	private Pageable getPageable(MoviePage moviePage) {
		Sort sort = Sort.by(moviePage.getSortDirection(), moviePage.getSortBy());
		return (Pageable) PageRequest.of(moviePage.getPageNumber(), moviePage.getPageSize(),sort);
	}



	public List<MovieDto> findMovieSuggestionsByDirector(String directorName) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<MovieDto> cq = cb.createQuery(MovieDto.class);

        Root<MovieDto> movie = cq.from(MovieDto.class);
        Predicate directoryNamePredicate = cb.like(movie.get("director"), "%" + directorName + "%");
        cq.where(directoryNamePredicate);

        TypedQuery<MovieDto> query = em.createQuery(cq);
        return query.getResultList();
	}
	
	private long getMoviesCount(Predicate predicate) {
		CriteriaQuery<Long> countQuery = cb.createQuery(Long.class);
		Root<MovieDto> countRoot = countQuery.from(MovieDto.class);
		countQuery.select(cb.count(countRoot)).where(predicate);
		return em.createQuery(countQuery).getSingleResult();
	}

}
