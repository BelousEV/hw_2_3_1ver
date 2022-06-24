package com.example.hw_2_3_1ver;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plus(Integer a, Integer b) {
        return a + b;
    }
    public int minus(Integer a, Integer b) {
        return a - b;
    }
    public int multiply(Integer a, Integer b) {
        return a * b;
    }
    public double divide(Integer a, Integer b) {
        return a.doubleValue() / b;
    }

}
