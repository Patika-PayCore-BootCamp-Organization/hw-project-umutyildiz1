package com.patikapaycoreumutyildiz.BookShop.Controller;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.BookService;
import com.patikapaycoreumutyildiz.BookShop.Entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/api/book/")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("all")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("{isbn}")
    public Book getBook(@PathVariable @Min(1) Integer isbn){
        return bookService.getBook(isbn);
    }

    @PostMapping("create")
    public void createBook(@RequestBody @Valid Book book){
        bookService.addBook(book);
    }

    @PutMapping("update")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("delete")
    public boolean deleteBook(@RequestParam @Min(1) Integer isbn){
        return bookService.deleteBook(isbn);
    }


}
