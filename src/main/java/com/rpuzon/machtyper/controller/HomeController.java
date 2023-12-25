package com.rpuzon.machtyper.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {
    @GetMapping("/")
    public String home() {
        log.info("Hello");
        return  "Hello, Home";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello, Secured!";
    }
}
