package com.osgomez.SemilleroPruebaTecnica.repository;

import com.osgomez.SemilleroPruebaTecnica.model.MovieTheatersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;


public interface MovieTheatersRepository extends MongoRepository<MovieTheatersEntity, String> {
    @Query("{ 'id' : ?0 }")
    Optional<MovieTheatersEntity> findById(String id);

    @Query("{capacity: {$gt: ?0}}")
    Optional<MovieTheatersEntity> findByCapacityGreaterThan(int capacity);
}
