package com.softtek.academia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softtek.academia.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
