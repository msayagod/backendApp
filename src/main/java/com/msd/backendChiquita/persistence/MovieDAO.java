package com.msd.backendChiquita.persistence;
import org.springframework.data.jpa.repository.JpaRepository;

import com.msd.backendChiquita.model.Movie;


public interface MovieDAO extends JpaRepository<Movie, Integer>{

}
