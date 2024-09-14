package com.osgomez.SemilleroPruebaTecnica.repository;

import com.osgomez.SemilleroPruebaTecnica.model.ReservationsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ReservationsRepository extends MongoRepository<ReservationsEntity, String> {
}
