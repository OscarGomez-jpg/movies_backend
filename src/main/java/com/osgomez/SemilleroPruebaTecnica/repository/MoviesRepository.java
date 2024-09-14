package com.osgomez.SemilleroPruebaTecnica.repository;

import com.osgomez.SemilleroPruebaTecnica.model.MoviesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;


public interface MoviesRepository extends MongoRepository<MoviesEntity, String> {
    @Query("{ 'id' : ?0 }")
    Optional<MoviesEntity> findById(String id);

    @Query("{ 'title' : ?0 }")
    List<MoviesEntity> findByTitle(String title);

    @Query("{ 'director' : ?0 }")
    List<MoviesEntity> findByDirector(String director);

    @Query("{ 'duration' : ?0 }")
    List<MoviesEntity> findByDuration(String duration);

    @Query("{ 'releaseDate' : ?0 }")
    List<MoviesEntity> findByReleaseDate(String releaseDate);
}
