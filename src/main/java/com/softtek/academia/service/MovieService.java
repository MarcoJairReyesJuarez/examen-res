package com.softtek.academia.service;

import java.util.List;

import com.softtek.academia.entity.Movie;

public interface MovieService {
	
	public List<Movie> getAllMovies();
	public Movie getMovieById(Long id);
	public boolean saveMovie(Movie Movie);
	public boolean deleteMovieById(Long id);

}
