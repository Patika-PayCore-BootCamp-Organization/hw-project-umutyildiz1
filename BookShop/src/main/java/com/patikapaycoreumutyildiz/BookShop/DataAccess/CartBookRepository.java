package com.patikapaycoreumutyildiz.BookShop.DataAccess;

import com.patikapaycoreumutyildiz.BookShop.Entities.Book;
import com.patikapaycoreumutyildiz.BookShop.Entities.Cart;
import com.patikapaycoreumutyildiz.BookShop.Entities.CartBook;
import com.patikapaycoreumutyildiz.BookShop.Entities.CartBookId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartBookRepository extends JpaRepository<CartBook,CartBookId> {
    List<CartBook> findCartBookByCartBookId_Cart(Cart cart);
    List<CartBook> findCartBookByCartBookId_Book(Book book);

}
