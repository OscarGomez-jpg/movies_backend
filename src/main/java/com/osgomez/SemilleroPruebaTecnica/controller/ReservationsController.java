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

    @GetMapping
    public List<ReservationsEntity> getAllReservations() {
        return reservationsService.getAllReservations();
    }

    @GetMapping("/{id}")
    public Optional<ReservationsEntity> getReservationById(@PathVariable String id) {
        return reservationsService.getReservationById(id);
    }

    @PostMapping
    public ReservationsEntity createReservation(@RequestBody ReservationsEntity reservationsEntity) {
        return reservationsService.saveReservation(reservationsEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteReservationById(@PathVariable String id) {
        reservationsService.deleteReservationById(id);
    }
}
