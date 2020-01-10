package com.softtek.academia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre {

	
	@Id
	@GeneratedValue
	private Integer genre_id;
	private String description;


	public Integer getGenre_id() {
		return genre_id;
	}


	public void setGenre_id(Integer genre_id) {
		this.genre_id = genre_id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
	
	
	
}
