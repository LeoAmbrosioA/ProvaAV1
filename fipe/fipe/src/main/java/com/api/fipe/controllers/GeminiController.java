package com.api.fipe.controllers;


import com.api.fipe.services.GeminiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeminiController {

    @Autowired
    private GeminiService geminiService;

    @GetMapping("/chatbot")
    public String generateContent() {

        return geminiService.generateContent();
    }
}