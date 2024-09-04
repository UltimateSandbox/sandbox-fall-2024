package com.sandbox.aggregation;

public class Driver {

    public static void main(String[] args) {

        // Aggregation example
        AggregationExample example = new AggregationExample();
        for(int x = 0; x < 10; x++) {
            example.getWidgets().add(new Widget());
        }
    }


}
