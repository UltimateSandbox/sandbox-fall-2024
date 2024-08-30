package com.sandbox.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoNumbers() {
        assertEquals(10, Calculator.add(5, 5));
        assertEquals(0, Calculator.add(-5, 5));
        assertEquals(-10, Calculator.add(-5, -5));
    }

    @Test
    void addMultipleNumbers() {
        assertEquals(15, Calculator.add(5, 5, 5));
        assertEquals(0, Calculator.add(0, 0, 0));
        assertEquals(-15, Calculator.add(-5, -5, -5));
    }

    @Test
    void subtract() {
        assertEquals(0, Calculator.subtract(5, 5));
        assertEquals(-10, Calculator.subtract(-5, 5));
        assertEquals(0, Calculator.subtract(0, 0));
    }

    @Test
    void multiply() {
        assertEquals(25, Calculator.multiply(5, 5));
        assertEquals(-25, Calculator.multiply(-5, 5));
        assertEquals(0, Calculator.multiply(0, 5));
    }

    @Test
    void divide() {
        assertEquals(1, Calculator.divide(5, 5));
        assertEquals(-1, Calculator.divide(-5, 5));
        assertEquals(0, Calculator.divide(0, 5));
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
    }
}