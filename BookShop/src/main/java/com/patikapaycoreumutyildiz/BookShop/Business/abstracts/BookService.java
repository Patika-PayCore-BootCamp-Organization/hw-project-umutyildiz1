package com.patikapaycoreumutyildiz.BookShop.Business.abstracts;

import com.patikapaycoreumutyildiz.BookShop.Entities.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBook(Integer isbn);
    void addBook(Book book);
    Book updateBook(Book book);
    boolean deleteBook(Integer isbn);


}
