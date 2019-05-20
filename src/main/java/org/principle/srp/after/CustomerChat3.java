package org.principle.srp.after;

import org.principle.srp.before.Customer;

public class CustomerChat3 {

    private CustomerDao customerDao;

    public CustomerChat3(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void displayCustomers() {
        for (Customer customer : customerDao.findCustomers()) {
            System.out.println(customer.name);
        }
    }

}
