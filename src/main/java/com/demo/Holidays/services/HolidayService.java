package com.demo.Holidays.services;

import com.demo.Holidays.entity.Holiday;
import com.demo.Holidays.exception.ResourceNotFoundException;
import com.demo.Holidays.repository.HolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HolidayService {
    private final HolidayRepository holidayRepository;

    @Autowired
    public HolidayService(HolidayRepository holidayRepository) {
        this.holidayRepository = holidayRepository;
    }

    public Holiday addHoliday(Holiday holiday) {
        return holidayRepository.save(holiday);
    }

    public Holiday updateHoliday(Long id, Holiday holidayDetails) {
        Holiday holiday = holidayRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Holiday not found"));

        holiday.setName(holidayDetails.getName());
        holiday.setDate(holidayDetails.getDate());
        return holidayRepository.save(holiday);
    }

    public List<Holiday> getHolidaysByCountry(String country) {
        return holidayRepository.findByCountry(country);
    }
}
