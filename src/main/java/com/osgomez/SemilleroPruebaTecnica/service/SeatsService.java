package com.osgomez.SemilleroPruebaTecnica.service;

import com.osgomez.SemilleroPruebaTecnica.model.SeatsEntity;
import com.osgomez.SemilleroPruebaTecnica.repository.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeatsService {

    @Autowired
    private SeatsRepository seatsRepository;

    public List<SeatsEntity> getAllSeats() {
        return seatsRepository.findAll();
    }

    public Optional<SeatsEntity> getSeatById(String id) {
        return seatsRepository.findById(id);
    }

    public SeatsEntity saveSeat(SeatsEntity seatsEntity) {
        return seatsRepository.save(seatsEntity);
    }

    public void deleteSeatById(String id) {
        seatsRepository.deleteById(id);
    }
}
