package com.xkcoding.ratelimit.guava.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class TestStringService {
    public String execute(String input) {
        return "test";
    }
}
