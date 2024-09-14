package com.osgomez.SemilleroPruebaTecnica.repository;

import com.osgomez.SemilleroPruebaTecnica.model.ReservationsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface ReservationsRepository extends MongoRepository<ReservationsEntity, String> {
    @Query("{clientId: ?0}")
    ReservationsEntity findByClientId(String clientId);

    @Query("{seatsReserved: {$gt: ?0}}")
    ReservationsEntity findBySeatsReservedGreaterThan(int seatsReserved);
}
