package com.kozznation.eventManagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "theatre")
public class Theatre {

	@Id
	private long id;
    private String name;
    private String address;
    private long numberOfScreens;
    private double rating;
    private String image;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getNumberOfScreens() {
		return numberOfScreens;
	}
	public void setNumberOfScreens(long numberOfScreens) {
		this.numberOfScreens = numberOfScreens;
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

}
