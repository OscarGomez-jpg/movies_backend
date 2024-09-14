package com.osgomez.SemilleroPruebaTecnica.controller;

import com.osgomez.SemilleroPruebaTecnica.model.MoviesEntity;
import com.osgomez.SemilleroPruebaTecnica.repository.MoviesRepository;
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

    /**
     * Retrieves all movies.
     *
     * @return a list of all movies
     */
    @GetMapping
    public List<MoviesEntity> getAllMovies() {
        return moviesService.getAllMovies();
    }

    /**
     * Retrieves a movie by its ID.
     *
     * @param id the ID of the movie
     * @return an Optional containing the movie if found, or empty if not found
     */
    @GetMapping("/{id}")
    public Optional<MoviesEntity> getMovieById(@PathVariable String id) {
        return moviesService.getMovieById(id);
    }

    /**
     * Creates a new movie.
     *
     * @param moviesEntity the movie entity to create
     * @return the created movie entity
     */
    @PostMapping
    public MoviesEntity createMovie(@RequestBody MoviesEntity moviesEntity) {
        return moviesService.saveMovie(moviesEntity);
    }

    /**
     * Deletes a movie by its ID.
     *
     * @param id the ID of the movie to delete
     */
    @DeleteMapping("/{id}")
    public void deleteMovieById(@PathVariable String id) {
        moviesService.deleteMovieById(id);
    }
}
