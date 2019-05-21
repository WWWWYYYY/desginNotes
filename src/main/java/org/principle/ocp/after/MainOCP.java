package org.principle.ocp.after;


/**
 * 为了满足开闭原则，让{@link ChartDisplayManager}依赖{@link Chart}接口，这样就不会因为新增一个新图标而修改ChartDisplayManager。
 */
public class MainOCP {
    public static void main(String[] args) {
        ChartDisplayManager manager =new ChartDisplayManager();
        manager.display(new BarChart());
    }
}
