package com.example.springboot.movie.repository;

import com.example.springboot.movie.model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    Optional<MovieEntity> findByTitle(String title);
}
