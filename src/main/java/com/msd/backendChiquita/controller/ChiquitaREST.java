package com.msd.backendChiquita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.msd.backendChiquita.model.Movie;
import com.msd.backendChiquita.persistence.MovieDAO;

@RestController
public class ChiquitaREST {
	
	@Autowired
	private MovieDAO movieDao;
	
//	@GetMapping("/api/movie/{id}")
//	public Movie getMovie(@PathVariable int id) {
//		return movieDao.findById(id).get();
//	}

	@GetMapping("/")
	public String getHello() {
		return"Hello world";
	}
	
	@GetMapping("/hello")
	public String getHello2() {
		return"Buenas tardes";
	}
	
}
