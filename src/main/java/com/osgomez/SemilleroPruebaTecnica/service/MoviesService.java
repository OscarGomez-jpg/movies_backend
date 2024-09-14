package com.osgomez.SemilleroPruebaTecnica.service;

import com.osgomez.SemilleroPruebaTecnica.model.MoviesEntity;
import com.osgomez.SemilleroPruebaTecnica.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {

    @Autowired
    private MoviesRepository moviesRepository;

    public List<MoviesEntity> getAllMovies() {
        return moviesRepository.findAll();
    }

    public Optional<MoviesEntity> getMovieById(String id) {
        return moviesRepository.findById(id);
    }

    public MoviesEntity saveMovie(MoviesEntity moviesEntity) {
        return moviesRepository.save(moviesEntity);
    }

    public void deleteMovieById(String id) {
        moviesRepository.deleteById(id);
    }
}
