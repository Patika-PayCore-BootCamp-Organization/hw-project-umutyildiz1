package com.patikapaycoreumutyildiz.BookShop.Business.abstracts;

import com.patikapaycoreumutyildiz.BookShop.Entities.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomer(Integer id);
    void addCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    boolean deleteCustomer(Integer id);
}
