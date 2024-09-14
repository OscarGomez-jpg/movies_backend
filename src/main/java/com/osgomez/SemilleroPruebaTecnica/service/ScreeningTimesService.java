package com.osgomez.SemilleroPruebaTecnica.service;

import com.osgomez.SemilleroPruebaTecnica.model.ScreeningTimesEntity;
import com.osgomez.SemilleroPruebaTecnica.repository.ScreeningTimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScreeningTimesService {

    @Autowired
    private ScreeningTimesRepository screeningTimesRepository;

    public List<ScreeningTimesEntity> getAllScreeningTimes() {
        return screeningTimesRepository.findAll();
    }

    public Optional<ScreeningTimesEntity> getScreeningTimeById(String id) {
        return screeningTimesRepository.findById(id);
    }

    public ScreeningTimesEntity saveScreeningTime(ScreeningTimesEntity screeningTimesEntity) {
        return screeningTimesRepository.save(screeningTimesEntity);
    }

    public void deleteScreeningTimeById(String id) {
        screeningTimesRepository.deleteById(id);
    }
}
