package com.phapaspring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class BaseController {
    public static ResponseEntity<?> success(Object data) {

        Map<String, Object> response = new HashMap<>();

        response.put("Status", "200");
        response.put("Message", "Success");
        response.put("Data", data);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    public static ResponseEntity<?> created(Object data) {

        Map<String, Object> response = new HashMap<>();

        response.put("Status", "201");
        response.put("Message", "Created Successfully");
        response.put("Data", data);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
