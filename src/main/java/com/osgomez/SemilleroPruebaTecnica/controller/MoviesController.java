package com.osgomez.SemilleroPruebaTecnica.controller;

import com.osgomez.SemilleroPruebaTecnica.model.MoviesEntity;
import com.osgomez.SemilleroPruebaTecnica.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    @GetMapping
    public List<MoviesEntity> getAllMovies() {
        return moviesService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Optional<MoviesEntity> getMovieById(@PathVariable String id) {
        return moviesService.getMovieById(id);
    }

    @PostMapping
    public MoviesEntity createMovie(@RequestBody MoviesEntity moviesEntity) {
        return moviesService.saveMovie(moviesEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteMovieById(@PathVariable String id) {
        moviesService.deleteMovieById(id);
    }
}
