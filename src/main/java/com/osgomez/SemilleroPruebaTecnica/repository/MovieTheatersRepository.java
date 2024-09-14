package com.osgomez.SemilleroPruebaTecnica.repository;

import com.osgomez.SemilleroPruebaTecnica.model.MovieTheatersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MovieTheatersRepository extends MongoRepository<MovieTheatersEntity, String> {
}
