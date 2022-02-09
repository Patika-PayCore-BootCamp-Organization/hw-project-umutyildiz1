package com.patikapaycoreumutyildiz.BookShop.Business.concretes;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.CustomerService;
import com.patikapaycoreumutyildiz.BookShop.DataAccess.CustomerRepository;
import com.patikapaycoreumutyildiz.BookShop.Entities.Customer;
import com.patikapaycoreumutyildiz.BookShop.Exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(Integer id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.orElseThrow(() -> new NotFoundException("Customer"));
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public boolean deleteCustomer(Integer id) {
        Optional<Customer> customer = Optional.of(getCustomer(id));
        if(customer.isPresent()){
            customerRepository.delete(customer.get());
            return true;
        }
        return false;
    }
}
