package com.softtek.academia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academia.entity.Director;
import com.softtek.academia.repository.DirectorRepository;

@Service
@Transactional
public class DirectorServiceImpl implements DirectorService{
	
	
	@Autowired
	private DirectorRepository repository;

	@Override
	public List<Director> getAllDirectors() {
		return (List<Director>) repository.findAll();
	}

	@Override
	public Director getDirectorById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveDirector(Director Director) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDirectorById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
