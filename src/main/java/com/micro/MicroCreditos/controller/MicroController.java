package com.micro.MicroCreditos.controller;

import com.micro.MicroCreditos.service.MicroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MicroController {

    @Autowired
    MicroService microService;

    @GetMapping
    public String getMicroCreditContract() {

        microService.getMicroCreditContract();

        return "Test conection";
    }
}
