package com.osgomez.SemilleroPruebaTecnica.repository;

import com.osgomez.SemilleroPruebaTecnica.model.SeatsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SeatsRepository extends MongoRepository<SeatsEntity, String> {
}
