package com.sandbox.calculator;

public class Computation {

    private Calculator calculator;

    public Computation(Calculator calculator) {
        this.calculator = calculator;
    }

    public int addFiveAndFour() {
        return calculator.add(5, 4);
    }

    public int subtractFiveAndFour() {
        return calculator.subtract(5, 4);
    }

}
