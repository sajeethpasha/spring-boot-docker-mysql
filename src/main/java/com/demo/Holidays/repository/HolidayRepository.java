package com.demo.Holidays.repository;



import com.demo.Holidays.entity.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface HolidayRepository extends JpaRepository<Holiday, Long> {
    List<Holiday> findByCountry(String country);
}
