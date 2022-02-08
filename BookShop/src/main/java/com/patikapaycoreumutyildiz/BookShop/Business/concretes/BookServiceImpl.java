package com.patikapaycoreumutyildiz.BookShop.Business.concretes;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.BookService;
import com.patikapaycoreumutyildiz.BookShop.DataAccess.BookRepository;
import com.patikapaycoreumutyildiz.BookShop.Entities.Book;
import com.patikapaycoreumutyildiz.BookShop.Exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(Integer isbn) {
        Optional<Book> book = bookRepository.findById(isbn);
        return book.orElseThrow(() -> new NotFoundException("Book"));
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public boolean deleteBook(Integer isbn) {
        Optional<Book> book = Optional.of(getBook(isbn));
        if(book.isPresent()){
            bookRepository.delete(book.get());
        }
        return false;
    }
}
