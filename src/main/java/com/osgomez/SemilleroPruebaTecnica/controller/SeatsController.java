package com.osgomez.SemilleroPruebaTecnica.controller;

import com.osgomez.SemilleroPruebaTecnica.model.SeatsEntity;
import com.osgomez.SemilleroPruebaTecnica.service.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/seats")
public class SeatsController {

    @Autowired
    private SeatsService seatsService;

    /**
     * Retrieves all seats.
     *
     * @return a list of all seats
     */
    @GetMapping
    public List<SeatsEntity> getAllSeats() {
        return seatsService.getAllSeats();
    }

    /**
     * Retrieves a seat by its ID.
     *
     * @param id the ID of the seat
     * @return an Optional containing the seat if found, or empty if not found
     */
    @GetMapping("/{id}")
    public Optional<SeatsEntity> getSeatById(@PathVariable String id) {
        return seatsService.getSeatById(id);
    }

    /**
     * Creates a new seat.
     *
     * @param seatsEntity the seat entity to create
     * @return the created seat entity
     */
    @PostMapping
    public SeatsEntity createSeat(@RequestBody SeatsEntity seatsEntity) {
        return seatsService.saveSeat(seatsEntity);
    }

    /**
     * Deletes a seat by its ID.
     *
     * @param id the ID of the seat to delete
     */
    @DeleteMapping("/{id}")
    public void deleteSeatById(@PathVariable String id) {
        seatsService.deleteSeatById(id);
    }
}
