package org.principle.srp.after;

public class MainApp {


    /**
     *  传入引用的方式有3种
     *
     *  1、set方法
     *  2、普通方法参数
     *  3、构造方法的参数
     *  按依赖性程度从高到低是3>1>2
     *  放到构造方法中{@link CustomerChat3#CustomerChat3(CustomerDao)}，说明CustomerChat强依赖CustomerDao
     *  通过set方法设置到{@link CustomerChat}中，说明CustomerDao在{@link CustomerChat}中使用次数比较频繁，依赖性不高也不低
     *  使用普通方法参数，说明{@link CustomerChat2}对{@link CustomerDao}类的依赖很低，使用次数也不多，说明耦合度也很低，。
     *
     *  ps：比如生成试卷，通过不同策略对象生成不同难以程度的试卷。
     *  如果希望这个策略永远不变，为了不让程序有机会改变，只有在构造方法上传入策略对象，并且不提供修改策略的方法
     *  如果希望生成一百张使用了同一策略的试卷，生成后再选择新的策略生成100张试卷。就使用set方式。
     *  如果希望每张试卷使用了不重复的策略。就使用普通方法参数传递。当然也可以使用set，就是每次生成试卷之前，要反复调用set方法，显得不优雅。
     */
    public static void main(String[] args) {
        //如果CustomerDao和CustomerChat的关系比较密切的情况下使用第一种改法，如果关系一般时，选择第二种改法
        //是否密切：判断CustomerChat类中是否频繁使用customerDao实例。
        System.out.println("*******************第一种改法****************");
        CustomerChat customerChat = new CustomerChat();
        customerChat.setCustomerDao(new CustomerDao());//注入dao实例
        customerChat.displayCustomers();
        System.out.println("*******************第二种改法****************");
        CustomerChat2 customerChat2 = new CustomerChat2();
        CustomerDao customerDao = new CustomerDao();
        customerChat2.displayCustomers(customerDao);
        System.out.println("*******************第三种改法****************");
        CustomerChat3 customerChat3 = new CustomerChat3(customerDao);
        customerChat3.displayCustomers();
    }
}
