package com.xkcoding.ratelimit.guava.service;

import static  org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SimpleServiceTest {
    //代测试的接口
    @InjectMocks
    public SimpleService simpleService;

    //接口依赖的类
    @Mock
    public TestStringService testStringService;

    @Test
    public void simpleTest() {
        when(testStringService.execute(anyString())).thenReturn("c");
        System.out.println(simpleService.simpleExecute("a"));
    }
}
