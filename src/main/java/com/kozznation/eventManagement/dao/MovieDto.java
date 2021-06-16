package com.kozznation.eventManagement.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class MovieDto {
	
	@Id
    private long id;
    private String title;
    private String director;
    private String lead1;
    private String lead2;
    private String duration;
    private String genre;
    private double rating;
    private String image;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLead1() {
		return lead1;
	}
	public void setLead1(String lead1) {
		this.lead1 = lead1;
	}
	public String getLead2() {
		return lead2;
	}
	public void setLead2(String lead2) {
		this.lead2 = lead2;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", lead1=" + lead1 + ", lead2=" + lead2
				+ ", duration=" + duration + ", genre=" + genre + ", rating=" + rating + ", image=" + image + "]";
	}
	
    
    
	
}
