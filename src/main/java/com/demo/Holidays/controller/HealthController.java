package com.demo.Holidays.controller;


import com.demo.Holidays.entity.Holiday;
import com.demo.Holidays.services.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HealthController {


    @GetMapping("")
    public ResponseEntity<List<String>> hello() {
        List<String> holidays = new ArrayList<String>();
        holidays.add("hello");
        return new ResponseEntity<>(holidays, HttpStatus.OK);
    }

}
