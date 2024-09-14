package com.osgomez.SemilleroPruebaTecnica.repository;

import com.osgomez.SemilleroPruebaTecnica.model.ScreeningTimesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ScreeningTimesRepository extends MongoRepository<ScreeningTimesEntity, String> {
}
