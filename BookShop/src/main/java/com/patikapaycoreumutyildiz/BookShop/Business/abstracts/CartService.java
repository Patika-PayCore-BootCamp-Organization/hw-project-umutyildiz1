package com.patikapaycoreumutyildiz.BookShop.Business.abstracts;

import com.patikapaycoreumutyildiz.BookShop.Entities.Cart;

import java.util.List;

public interface CartService {
    List<Cart> getAllCarts();
    Cart getCart(Integer id);
    void addCart(Cart cart);
    Cart updateCart(Cart cart);
    boolean deleteCart(Integer id);
}
