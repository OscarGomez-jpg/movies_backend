package com.osgomez.SemilleroPruebaTecnica.repository;

import com.osgomez.SemilleroPruebaTecnica.model.ScreeningTimesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface ScreeningTimesRepository extends MongoRepository<ScreeningTimesEntity, String> {
    @Query("{date: ?0}")
    ScreeningTimesEntity findByDate(String date);

    @Query("{startTime: ?0}")
    ScreeningTimesEntity findByStartTime(String startTime);
}
