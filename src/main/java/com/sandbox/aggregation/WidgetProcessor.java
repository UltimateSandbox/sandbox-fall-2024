package com.sandbox.aggregation;

import java.util.ArrayList;
import java.util.List;

public class WidgetProcessor {

    // These widgets are composed in a pure composition relationship
    Widget a;
    Widget b;
    Widget c;

    // While the List itself is composed in a pure composition relationship,
    // the Widgets it contains are encapsulated in the List in an aggregation relationship
    private List<Widget> widgets;

    public WidgetProcessor() {

        // pure composition
        a = new Widget();
        b = new Widget();
        c = new Widget();
        widgets = new ArrayList<>();

    }

    // used to aggregate Widgets
    public void addWidget(Widget widget) {
        widgets.add(widget);
    }

    public void processWidgets() {
        for (Widget widget : widgets) {
            System.out.println("Processing widget: " + widget);
        }
    }
}
