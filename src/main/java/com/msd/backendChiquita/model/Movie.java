package com.msd.backendChiquita.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
	private String movie_title;
	private Integer movie_year;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movie_id;

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public Integer getMovie_year() {
		return movie_year;
	}

	public void setMovie_year(Integer movie_year) {
		this.movie_year = movie_year;
	}

	public Integer getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}

}
