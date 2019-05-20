package org.principle.srp.after;

import org.principle.srp.before.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

    /**
     * 在数据库中查询出所有客户
     * @return
     */
    public List<Customer> findCustomers(){
        System.out.println("执行sql语句");
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("ww",18));
        customers.add(new Customer("yy",19));
        return customers;
    }
}
