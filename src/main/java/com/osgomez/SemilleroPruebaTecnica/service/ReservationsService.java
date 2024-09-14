package com.osgomez.SemilleroPruebaTecnica.service;

import com.osgomez.SemilleroPruebaTecnica.model.ReservationsEntity;
import com.osgomez.SemilleroPruebaTecnica.repository.ReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationsService {
    @Autowired
    private ReservationsRepository reservationsRepository;

    public List<ReservationsEntity> getAllReservations() {
        return reservationsRepository.findAll();
    }

    public Optional<ReservationsEntity> getReservationById(String id) {
        return reservationsRepository.findById(id);
    }

    public ReservationsEntity saveReservation(ReservationsEntity reservationsEntity) {
        return reservationsRepository.save(reservationsEntity);
    }

    public void deleteReservationById(String id) {
        reservationsRepository.deleteById(id);
    }
}
