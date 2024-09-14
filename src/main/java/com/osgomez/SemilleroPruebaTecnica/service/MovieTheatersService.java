package com.osgomez.SemilleroPruebaTecnica.service;

import com.osgomez.SemilleroPruebaTecnica.model.MovieTheatersEntity;
import com.osgomez.SemilleroPruebaTecnica.repository.MovieTheatersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieTheatersService {
    @Autowired
    private MovieTheatersRepository movieTheatersRepository;

    public List<MovieTheatersEntity> getAllTheaters() {
        return movieTheatersRepository.findAll();
    }

    public Optional<MovieTheatersEntity> getTheaterById(String id) {
        return movieTheatersRepository.findById(id);
    }

    public MovieTheatersEntity saveTheater(MovieTheatersEntity movieTheatersEntity) {
        return movieTheatersRepository.save(movieTheatersEntity);
    }

    public void deleteTheaterById(String id) {
        movieTheatersRepository.deleteById(id);
    }
}
