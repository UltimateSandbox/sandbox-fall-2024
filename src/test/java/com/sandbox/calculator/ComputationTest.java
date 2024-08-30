package com.sandbox.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ComputationTest {

    private Calculator calculator;
    private Computation computation;

    @BeforeEach
    void setUp() {
        calculator = Mockito.mock(Calculator.class);
        computation = new Computation(calculator);
    }

    @Test
    void testAddFiveAndFour() {
        when(calculator.add(5, 4)).thenReturn(9);
        assertEquals(9, computation.addFiveAndFour());
        verify(calculator).add(5, 4);
    }

    @Test
    void testSubtractFiveAndFour() {
        when(calculator.subtract(5, 4)).thenReturn(1);
        assertEquals(1, computation.subtractFiveAndFour());
        verify(calculator).subtract(5, 4);
    }
}