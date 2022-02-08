package com.patikapaycoreumutyildiz.BookShop.Controller;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart/")
public class CartController {

    @Autowired
    private CartService cartService;
}
