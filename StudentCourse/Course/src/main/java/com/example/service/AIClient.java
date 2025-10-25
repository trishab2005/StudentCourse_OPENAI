package com.example.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "AI")
public interface AIClient {
    @GetMapping("ai")
    public String prompt();
}