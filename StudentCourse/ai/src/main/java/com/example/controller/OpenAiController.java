package com.example.controller;

import com.example.service.OpenAIService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OpenAiController {
    @Autowired
    private  OpenAIService openAIService;

    @GetMapping("ai")
    public String prompt() {
        return openAIService.getAnswer("WHAT IS AI?");
    }
}
