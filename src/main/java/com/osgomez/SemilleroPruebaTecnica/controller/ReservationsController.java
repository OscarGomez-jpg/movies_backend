package com.osgomez.SemilleroPruebaTecnica.controller;

import com.osgomez.SemilleroPruebaTecnica.model.ReservationsEntity;
import com.osgomez.SemilleroPruebaTecnica.service.ReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
public class ReservationsController {

    @Autowired
    private ReservationsService reservationsService;

    /**
     * Retrieves all reservations.
     *
     * @return a list of all reservations
     */
    @GetMapping
    public List<ReservationsEntity> getAllReservations() {
        return reservationsService.getAllReservations();
    }

    /**
     * Retrieves a reservation by its ID.
     *
     * @param id the ID of the reservation
     * @return an Optional containing the reservation if found, or empty if not found
     */
    @GetMapping("/{id}")
    public Optional<ReservationsEntity> getReservationById(@PathVariable String id) {
        return reservationsService.getReservationById(id);
    }

    /**
     * Creates a new reservation.
     *
     * @param reservationsEntity the reservation entity to create
     * @return the created reservation entity
     */
    @PostMapping
    public ReservationsEntity createReservation(@RequestBody ReservationsEntity reservationsEntity) {
        return reservationsService.saveReservation(reservationsEntity);
    }

    /**
     * Deletes a reservation by its ID.
     *
     * @param id the ID of the reservation to delete
     */
    @DeleteMapping("/{id}")
    public void deleteReservationById(@PathVariable String id) {
        reservationsService.deleteReservationById(id);
    }
}
