package org.principle.srp.after;

import org.principle.srp.before.Customer;

public class CustomerChat2 {

    public void displayCustomers(CustomerDao customerDao) {
        for (Customer customer : customerDao.findCustomers()) {
            System.out.println(customer.name);
        }
    }
}
