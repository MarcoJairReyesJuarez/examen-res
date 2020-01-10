package com.softtek.academia.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="director")
public class Director {
	
	@Id
	@GeneratedValue
	private Integer director_id;
	
	private String name;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="nationality_id")
	private Nationality nationality_id;
	
	
	public Integer getDirector_id() {
		return director_id;
	}
	public void setDirector_id(Integer director_id) {
		this.director_id = director_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Nationality getNationality_id() {
		return nationality_id;
	}
	public void setNationality_id(Nationality nationality_id) {
		this.nationality_id = nationality_id;
	}
}
