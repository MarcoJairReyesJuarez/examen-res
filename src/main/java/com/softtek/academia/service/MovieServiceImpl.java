package com.softtek.academia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academia.entity.Movie;
import com.softtek.academia.repository.MovieRepository;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository repository;

	@Override
	public List<Movie> getAllMovies() {
		return (List<Movie>) repository.findAll();
	}

	@Override
	public Movie getMovieById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveMovie(Movie Movie) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMovieById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
