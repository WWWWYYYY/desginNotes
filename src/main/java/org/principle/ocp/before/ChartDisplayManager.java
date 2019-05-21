package org.principle.ocp.before;

public class ChartDisplayManager {
    public void display(String name) {
        if ("bar".equals(name)){
            new BarChart().display();
        }

        if ("pie".equals(name)){
            new PieChart().display();
        }
        if ("line".equals(name)){
            new LineChart().display();
        }
    }
}
