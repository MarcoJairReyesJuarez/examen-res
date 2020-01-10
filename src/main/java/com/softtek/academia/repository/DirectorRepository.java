package com.softtek.academia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softtek.academia.entity.Director;

@Repository
public interface DirectorRepository extends CrudRepository<Director, Integer>{
	
}