package com.patikapaycoreumutyildiz.BookShop.Business.concretes;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.CartService;
import com.patikapaycoreumutyildiz.BookShop.DataAccess.CartRepository;
import com.patikapaycoreumutyildiz.BookShop.Entities.Book;
import com.patikapaycoreumutyildiz.BookShop.Entities.Cart;
import com.patikapaycoreumutyildiz.BookShop.Exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    public Cart getCart(Integer id) {
        Optional<Cart> cart = cartRepository.findById(id);
        return cart.orElseThrow(() -> new NotFoundException("Cart"));
    }

    @Override
    public void addCart(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public boolean deleteCart(Integer id) {
        Optional<Cart> cart = Optional.of(getCart(id));
        if(cart.isPresent()){
            cartRepository.delete(cart.get());
            return true;
        }
        return false;
    }
}
