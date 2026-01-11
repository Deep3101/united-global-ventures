package com.ugv;

import com.ugv.testcase.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2,6);
        assertEquals(8,result);
    }
    
    @Test
    void testMultiply(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2,3);
        assertEquals(6,result);
    }
}
