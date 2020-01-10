package com.softtek.academia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softtek.academia.entity.Nationality;

@Repository
public interface NationalityRepository extends CrudRepository<Nationality, String>{
	
}
