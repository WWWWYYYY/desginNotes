package org.principle.srp.before;

import java.util.ArrayList;
import java.util.List;

public class CustomerChat {

    protected List<Customer> findCustomers(){
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("ww",18));
        customers.add(new Customer("yy",19));
        return customers;
    }

    public void displayCustomers(){
        for (Customer customer : findCustomers()) {
            System.out.println(customer.name);
        }
    }
}
