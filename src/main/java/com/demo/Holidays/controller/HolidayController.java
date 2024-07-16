package com.demo.Holidays.controller;


import com.demo.Holidays.entity.Holiday;
import com.demo.Holidays.services.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/holidays")
public class HolidayController {
    private final HolidayService holidayService;

    @Autowired
    public HolidayController(HolidayService holidayService) {
        this.holidayService = holidayService;
    }

    @PostMapping
    public ResponseEntity<Holiday> addHoliday(@RequestBody Holiday holiday) {
        Holiday newHoliday = holidayService.addHoliday(holiday);
        return new ResponseEntity<>(newHoliday, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Holiday> updateHoliday(@PathVariable Long id, @RequestBody Holiday holidayDetails) {
        Holiday updatedHoliday = holidayService.updateHoliday(id, holidayDetails);
        return new ResponseEntity<>(updatedHoliday, HttpStatus.OK);
    }

    @GetMapping("/{country}")
    public ResponseEntity<List<Holiday>> getHolidaysByCountry(@PathVariable String country) {
        List<Holiday> holidays = holidayService.getHolidaysByCountry(country);
        return new ResponseEntity<>(holidays, HttpStatus.OK);
    }
}
