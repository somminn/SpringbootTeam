package com.example.springboot.movie.controller;



import com.example.springboot.movie.model.MovieDto;
import com.example.springboot.movie.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")

public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody MovieDto.Save dto){
        movieService.save(dto);

        return ResponseEntity.status(200).body("완료");
    }

    @GetMapping("/list")
    public ResponseEntity list(){
        List<MovieDto.Movie> response = movieService.list();

        return ResponseEntity.status(200).body(response);
    }


    @GetMapping("/read")
    public ResponseEntity read(Integer idx){
        MovieDto.Movie response = movieService.read(idx);

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/search")
    public ResponseEntity search(String title){
        List<MovieDto.Movie> response = movieService.search(title);

        return ResponseEntity.status(200).body(response);
    }

}
