package com.patikapaycoreumutyildiz.BookShop.Business.abstracts;

import com.patikapaycoreumutyildiz.BookShop.Entities.Cart;
import com.patikapaycoreumutyildiz.BookShop.Entities.CartBook;
import com.patikapaycoreumutyildiz.BookShop.Entities.CartBookId;

import java.util.List;

public interface CartBookService {

    List<CartBook> getAllCartBooks();
    CartBook getCartBook(CartBookId cartBookId);
    void addCartBook(CartBook cartBook);
    CartBook updateCartBook(CartBook cartBook);
    boolean deleteCartBook(CartBookId cartBookId);
}
