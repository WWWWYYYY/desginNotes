package org.principle.ocp.before;


/**
 * 每次新增xxChart类时需要修改到已有的类{@link ChartDisplayManager#display(String)},这是不符合开闭原则的
 */
public class MainOCP {
    public static void main(String[] args) {
        ChartDisplayManager manager =new ChartDisplayManager();
        manager.display("bar");
    }
}
