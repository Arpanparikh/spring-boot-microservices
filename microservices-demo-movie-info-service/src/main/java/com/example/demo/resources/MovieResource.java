package com.example.demo.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@Value("${movie-name}")
	private String movieName;
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId){
		
		return new Movie(movieId, movieName);
	}
}
