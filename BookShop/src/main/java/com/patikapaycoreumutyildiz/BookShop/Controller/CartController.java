package com.patikapaycoreumutyildiz.BookShop.Controller;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.CartService;
import com.patikapaycoreumutyildiz.BookShop.Entities.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/api/cart/")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("all")
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }

    @GetMapping("{id}")
    public Cart getCart(@PathVariable @Min(1) Integer id) {
        return cartService.getCart(id);
    }

    @PostMapping("create")
    public void addCart(@Valid @RequestBody Cart cart) {
        cartService.addCart(cart);
    }

    @PutMapping("update")
    public Cart updateCart(@Valid @RequestBody Cart cart) {
        return cartService.updateCart(cart);
    }

    @DeleteMapping("delete")
    public boolean deleteCart(@RequestParam @Min(1) Integer id) {
        return cartService.deleteCart(id);
    }
}
