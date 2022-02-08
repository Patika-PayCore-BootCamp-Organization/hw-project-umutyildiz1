package com.patikapaycoreumutyildiz.BookShop.Controller;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
}
