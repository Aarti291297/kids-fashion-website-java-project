package com.example.KidsFashion.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KidsFashion.entity.UserData;
import com.example.KidsFashion.repository.UserRepository;


@RestController
@RequestMapping("/log")

public class ApiController {
@Autowired
UserRepository ss;
@GetMapping("/kids")
public List<UserData>get(){
return ss.findAll();
}

   
}