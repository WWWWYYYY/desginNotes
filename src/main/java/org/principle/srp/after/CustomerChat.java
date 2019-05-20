package org.principle.srp.after;

import org.principle.srp.before.Customer;


public class CustomerChat {

    private CustomerDao customerDao;

    public void displayCustomers() {
        for (Customer customer : customerDao.findCustomers()) {
            System.out.println(customer.name);
        }
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
