package com.patikapaycoreumutyildiz.BookShop.Controller;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.CustomerService;
import com.patikapaycoreumutyildiz.BookShop.Entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/api/customer/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("{id}")
    public Customer getCustomer(@PathVariable @Min(1) Integer id){
        return customerService.getCustomer(id);
    }

    @PostMapping("create")
    public void createCustomer(@RequestBody @Valid Customer customer){
        customerService.addCustomer(customer);
    }

    @PutMapping("update")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("delete")
    public boolean deleteCustomer(@RequestParam @Min(1) Integer id){
        return customerService.deleteCustomer(id);
    }
}
