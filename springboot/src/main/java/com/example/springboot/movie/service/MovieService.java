package com.example.springboot.movie.service;

import com.example.springboot.movie.model.MovieDto;
import com.example.springboot.movie.model.MovieEntity;
import com.example.springboot.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void save(MovieDto.Save dto) {
        movieRepository.save(dto.toEntity());
    }

    public List<MovieDto.Movie> list() {
        List<MovieEntity> result = movieRepository.findAll();

        return result.stream().map(MovieDto.Movie::from).toList();
    }

    public MovieDto.Movie read(Integer idx) {
        Optional<MovieEntity> result = movieRepository.findById(idx);

        if(result.isPresent()) {
            MovieEntity entity = result.get();

            return MovieDto.Movie.from(entity);
        }

        return null;
    }

    public List<MovieDto.Movie> search(String title) {
        List<MovieEntity> result = movieRepository.findByTitle(title);

        return result.stream().map(MovieDto.Movie::from).toList();
    }
}
