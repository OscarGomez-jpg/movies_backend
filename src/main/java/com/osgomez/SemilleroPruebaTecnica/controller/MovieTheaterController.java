package com.osgomez.SemilleroPruebaTecnica.controller;

import com.osgomez.SemilleroPruebaTecnica.model.MovieTheatersEntity;
import com.osgomez.SemilleroPruebaTecnica.service.MovieTheatersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movie-theaters")
public class MovieTheaterController {

    @Autowired
    private MovieTheatersService movieTheatersService;

    @GetMapping
    public List<MovieTheatersEntity> getAllTheaters() {
        return movieTheatersService.getAllTheaters();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieTheatersEntity> getTheaterById(@PathVariable String id) {
        Optional<MovieTheatersEntity> theater = movieTheatersService.getTheaterById(id);
        return theater.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public MovieTheatersEntity createTheater(@RequestBody MovieTheatersEntity movieTheatersEntity) {
        return movieTheatersService.saveTheater(movieTheatersEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTheaterById(@PathVariable String id) {
        movieTheatersService.deleteTheaterById(id);
        return ResponseEntity.noContent().build();
    }
}