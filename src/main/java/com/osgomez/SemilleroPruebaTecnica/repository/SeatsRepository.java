package com.osgomez.SemilleroPruebaTecnica.repository;

import com.osgomez.SemilleroPruebaTecnica.model.SeatsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface SeatsRepository extends MongoRepository<SeatsEntity, String> {
    @Query("{row: ?0, column: ?1}")
    SeatsEntity findByRowAndColumn(String row, String column);

    @Query("{state: ?0}")
    SeatsEntity findByState(String state);
}
