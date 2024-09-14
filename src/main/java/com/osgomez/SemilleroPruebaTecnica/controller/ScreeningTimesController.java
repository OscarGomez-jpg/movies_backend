package com.osgomez.SemilleroPruebaTecnica.controller;

import com.osgomez.SemilleroPruebaTecnica.model.ScreeningTimesEntity;
import com.osgomez.SemilleroPruebaTecnica.service.ScreeningTimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller for handling screening times-related requests.
 */
@RestController
@RequestMapping("/screening-times")
public class ScreeningTimesController {

    @Autowired
    private ScreeningTimesService screeningTimesService;

    /**
     * Retrieves all screening times.
     *
     * @return a list of all screening times
     */
    @GetMapping
    public List<ScreeningTimesEntity> getAllScreeningTimes() {
        return screeningTimesService.getAllScreeningTimes();
    }

    /**
     * Retrieves a screening time by its ID.
     *
     * @param id the ID of the screening time
     * @return an Optional containing the screening time if found, or empty if not found
     */
    @GetMapping("/{id}")
    public Optional<ScreeningTimesEntity> getScreeningTimeById(@PathVariable String id) {
        return screeningTimesService.getScreeningTimeById(id);
    }

    /**
     * Creates a new screening time.
     *
     * @param screeningTimesEntity the screening time entity to create
     * @return the created screening time entity
     */
    @PostMapping
    public ScreeningTimesEntity createScreeningTime(@RequestBody ScreeningTimesEntity screeningTimesEntity) {
        return screeningTimesService.saveScreeningTime(screeningTimesEntity);
    }

    /**
     * Deletes a screening time by its ID.
     *
     * @param id the ID of the screening time to delete
     */
    @DeleteMapping("/{id}")
    public void deleteScreeningTimeById(@PathVariable String id) {
        screeningTimesService.deleteScreeningTimeById(id);
    }
}