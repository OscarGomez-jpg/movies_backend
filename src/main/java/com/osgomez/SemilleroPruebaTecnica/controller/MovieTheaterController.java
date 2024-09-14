package com.osgomez.SemilleroPruebaTecnica.controller;

import com.osgomez.SemilleroPruebaTecnica.model.MovieTheatersEntity;
import com.osgomez.SemilleroPruebaTecnica.service.MovieTheatersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Map;

/**
 * Controller for handling movie theater-related requests.
 */
@RestController
@RequestMapping("/movie-theaters")
public class MovieTheaterController {

    @Autowired
    private MovieTheatersService movieTheatersService;

    /**
     * Retrieves all movie theaters.
     *
     * @return a list of all movie theaters
     */
    @GetMapping
    public List<MovieTheatersEntity> getAllTheaters() {
        return movieTheatersService.getAllTheaters();
    }

    /**
     * Retrieves a movie theater by its ID.
     *
     * @param id the ID of the movie theater
     * @return a ResponseEntity containing the movie theater if found, or not found status if not found
     */
    @GetMapping("/{id}")
    public ResponseEntity<MovieTheatersEntity> getTheaterById(@PathVariable String id) {
        Optional<MovieTheatersEntity> theater = movieTheatersService.getTheaterById(id);
        return theater.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Creates a new movie theater.
     *
     * @param movieTheatersEntity the movie theater entity to create
     * @return the created movie theater entity
     */
    @PostMapping
    public MovieTheatersEntity createTheater(@RequestBody MovieTheatersEntity movieTheatersEntity) {
        return movieTheatersService.saveTheater(movieTheatersEntity);
    }

    /**
     * Updates the capacity of a movie theater.
     *
     * @param id the ID of the movie theater to update
     * @param updates a map containing the updates, specifically the capacity
     * @return a ResponseEntity indicating the result of the update operation
     */
    @PutMapping("/{id}")
    public ResponseEntity<String> updateTheaterCapacity(@PathVariable String id, @RequestBody Map<String, Integer> updates) {
        Optional<MovieTheatersEntity> theater = movieTheatersService.getTheaterById(id);
        if (theater.isPresent()) {
            MovieTheatersEntity existingTheater = theater.get();
            if (updates.containsKey("capacity")) {
                existingTheater.setCapacity(updates.get("capacity"));
                movieTheatersService.saveTheater(existingTheater);
                return ResponseEntity.ok("Capacity updated successfully.");
            } else {
                return ResponseEntity.badRequest().body("Capacity not provided in the request.");
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Deletes a movie theater by its ID.
     *
     * @param id the ID of the movie theater to delete
     * @return a ResponseEntity indicating the result of the delete operation
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTheaterById(@PathVariable String id) {
        movieTheatersService.deleteTheaterById(id);
        return ResponseEntity.noContent().build();
    }
}