package com.sandbox.aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {

    public AggregationExample() {

        new Widget();
        new Widget();
        new Widget();
    }

    // encapsulation example
    private List<Widget> widgets = new ArrayList<>();

    public List<Widget> getWidgets() {
        return widgets;
    }

    public void addWidget(Widget widget) {
        widgets.add(widget);
    }
}
