package com.example.demo.controller;

import com.example.demo.models.StatusUser;
import com.example.demo.services.StatusUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@PropertySource("classpath:application.properties")
@RequestMapping("/api/statuses")
public class StatusController {
    @Autowired
    private StatusUserService statusUserService;

    @GetMapping("")
    public ResponseEntity<Iterable<StatusUser>> findAllUser() {
        Iterable<StatusUser> statusUsers = statusUserService.findAll();
        return new ResponseEntity<>(statusUsers, HttpStatus.OK);
    }
}
