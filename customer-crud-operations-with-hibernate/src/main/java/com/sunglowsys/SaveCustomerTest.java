package com.sunglowsys;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerService;
import com.sunglowsys.service.CustomerServiceImpl;

public class SaveCustomerTest {

    public static void main(String[] args) {
        Customer customer = new Customer("Shivam", "Kumar", "shivam.kumar@sunglowsys.com", "9876543212");
        CustomerService customerService = new CustomerServiceImpl();
        Customer result = customerService.save(customer);
        System.out.println(result);
    }
}
