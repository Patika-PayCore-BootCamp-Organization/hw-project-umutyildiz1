package com.patikapaycoreumutyildiz.BookShop.Business.concretes;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.CartBookService;
import com.patikapaycoreumutyildiz.BookShop.DataAccess.CartBookRepository;
import com.patikapaycoreumutyildiz.BookShop.Entities.Cart;
import com.patikapaycoreumutyildiz.BookShop.Entities.CartBook;
import com.patikapaycoreumutyildiz.BookShop.Entities.CartBookId;
import com.patikapaycoreumutyildiz.BookShop.Exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartBookServiceImpl implements CartBookService {

    @Autowired
    private CartBookRepository cartBookRepository;

    @Override
    public List<CartBook> getAllCartBooks() {
        return cartBookRepository.findAll();
    }

    @Override
    public CartBook getCartBook(CartBookId cartBookId) {//dao ile düzelt
        Optional<CartBook> cartBook = cartBookRepository.findById(cartBookId);
        return cartBook.orElseThrow(() -> new NotFoundException("CartBook"));

    }

    @Override
    public void addCartBook(CartBook cartBook) {
        cartBookRepository.save(cartBook);
    }

    @Override
    public CartBook updateCartBook(CartBook cartBook) {
        return cartBookRepository.save(cartBook);
    }

    @Override
    public boolean deleteCartBook(CartBookId cartBookId) {
        Optional<CartBook> cartBook = Optional.of(getCartBook(cartBookId));
        if(cartBook.isPresent()){
            cartBookRepository.delete(cartBook.get());
            return true;
        }
        return false;
    }
}
