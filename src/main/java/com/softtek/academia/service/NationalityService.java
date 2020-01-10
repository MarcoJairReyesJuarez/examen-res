package com.softtek.academia.service;

import java.util.List;

import com.softtek.academia.entity.Nationality;

public interface NationalityService {
	
	public List<Nationality> getAllNationalitys();
	public Nationality getNationalityById(Long id);
	public boolean saveNationality(Nationality Nationality);
	public boolean deleteNationalityById(Long id);

}
