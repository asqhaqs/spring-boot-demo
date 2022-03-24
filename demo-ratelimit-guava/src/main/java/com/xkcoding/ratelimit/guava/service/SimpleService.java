package com.xkcoding.ratelimit.guava.service;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Lazy
@Service
public class SimpleService {
    @Resource
    private TestStringService testStringService;

    public String simpleExecute(String s) {
        return testStringService.execute(s);
    }
}
