package com.osgomez.SemilleroPruebaTecnica.repository;

import com.osgomez.SemilleroPruebaTecnica.model.MoviesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MoviesRepository extends MongoRepository<MoviesEntity, String> {
}
