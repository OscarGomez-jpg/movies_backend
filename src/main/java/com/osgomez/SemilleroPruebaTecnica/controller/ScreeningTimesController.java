package com.osgomez.SemilleroPruebaTecnica.controller;

import com.osgomez.SemilleroPruebaTecnica.model.ScreeningTimesEntity;
import com.osgomez.SemilleroPruebaTecnica.service.ScreeningTimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/screening-times")
public class ScreeningTimesController {

    @Autowired
    private ScreeningTimesService screeningTimesService;

    @GetMapping
    public List<ScreeningTimesEntity> getAllScreeningTimes() {
        return screeningTimesService.getAllScreeningTimes();
    }

    @GetMapping("/{id}")
    public Optional<ScreeningTimesEntity> getScreeningTimeById(@PathVariable String id) {
        return screeningTimesService.getScreeningTimeById(id);
    }

    @PostMapping
    public ScreeningTimesEntity createScreeningTime(@RequestBody ScreeningTimesEntity screeningTimesEntity) {
        return screeningTimesService.saveScreeningTime(screeningTimesEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteScreeningTimeById(@PathVariable String id) {
        screeningTimesService.deleteScreeningTimeById(id);
    }
}
