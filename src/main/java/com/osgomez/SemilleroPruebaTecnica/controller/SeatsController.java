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

    @GetMapping
    public List<SeatsEntity> getAllSeats() {
        return seatsService.getAllSeats();
    }

    @GetMapping("/{id}")
    public Optional<SeatsEntity> getSeatById(@PathVariable String id) {
        return seatsService.getSeatById(id);
    }

    @PostMapping
    public SeatsEntity createSeat(@RequestBody SeatsEntity seatsEntity) {
        return seatsService.saveSeat(seatsEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteSeatById(@PathVariable String id) {
        seatsService.deleteSeatById(id);
    }
}
