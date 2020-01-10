package com.softtek.academia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academia.entity.Nationality;
import com.softtek.academia.repository.NationalityRepository;

@Service
@Transactional
public class NationalityServiceImpl implements NationalityService {
	
	@Autowired
	private NationalityRepository repository;

	@Override
	public List<Nationality> getAllNationalitys() {
		return (List<Nationality>) repository.findAll();
	}

	@Override
	public Nationality getNationalityById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveNationality(Nationality Nationality) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteNationalityById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
