package com.softtek.academia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nationality")
public class Nationality {
	
	@Id
	@Column(name = "nationality_id")
	private String nationality_id;
	
	@Column(name = "description")
	private String description;
	
	
	public String getNationality_id() {
		return nationality_id;
	}
	public void setNationality_id(String nationality_id) {
		this.nationality_id = nationality_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	

}
