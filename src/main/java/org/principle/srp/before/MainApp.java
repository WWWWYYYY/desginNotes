package org.principle.srp.before;

public class MainApp {


    /**
     * 将{@link CustomerChat#findCustomers()}方法修改为从数据库读取客户信息，
     * 因此findCustomers涉及到了操作数据库的职责，需要创建一个关于操作数据库的类
     * 修改后参考after包
     */
    public static void main(String[] args) {
        CustomerChat customerChat = new CustomerChat();
        customerChat.displayCustomers();
    }
}
