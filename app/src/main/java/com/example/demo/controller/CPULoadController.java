package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CPULoadController {

    @GetMapping("/api/test")
    public String cpuLoad() {
        for (int i = 0; i < 10_000_000; i++) {
            Math.sqrt(i);
        }
        return "CPU load simulated!";
    }
}
