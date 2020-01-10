package com.softtek.academia.service;

import java.util.List;

import com.softtek.academia.entity.Director;

public interface DirectorService {
	
	public List<Director> getAllDirectors();
	public Director getDirectorById(Long id);
	public boolean saveDirector(Director Director);
	public boolean deleteDirectorById(Long id);

}
