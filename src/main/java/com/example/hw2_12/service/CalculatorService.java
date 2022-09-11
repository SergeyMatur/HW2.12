package com.example.hw2_12.service;

import com.example.hw2_12.exception.DivideByZeroException;
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

    public Number divide(Integer a, Integer b) {
        if (b == 0) {
            try {
                throw new DivideByZeroException("Делить на ноль нельзя!");
            } catch (DivideByZeroException e) {
                throw new RuntimeException(e);
            }
        }
        return a.doubleValue() / b;
    }
}
