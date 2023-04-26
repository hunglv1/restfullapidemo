package com.example.restful.serviceinterface;

import com.example.restful.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public List<Customer> initCustomerList() {
        List<Customer> customers = new ArrayList<>();

        Customer cus1 = new Customer(1, "le van hung", "hunglv@gmail.com");
        Customer cus2 = new Customer(2, "mohammad javanita", "mohammad@gmail.com");
        Customer cus3 = new Customer(3, "ai my luong", "aimyluong@gmail.com");
        Customer cus4 = new Customer(4, "nikhil kumar", "nikil@gmail.com");
        Customer cus5 = new Customer(5, "thamim mumhamad", "thamim@gmail.com");

        customers.add(cus1);
        customers.add(cus2);
        customers.add(cus3);
        customers.add(cus4);
        customers.add(cus5);

        return customers;
    }

    public List<Customer> searchCustomerList(int id, String name) {
        List<Customer> result = new ArrayList<>();
        List<Customer> customers = initCustomerList();

        for (Customer customer : customers) {
            if (customer.getId() == id || customer.getName().contains(name))
                result.add(customer);
        }

        return result;
    }
}
