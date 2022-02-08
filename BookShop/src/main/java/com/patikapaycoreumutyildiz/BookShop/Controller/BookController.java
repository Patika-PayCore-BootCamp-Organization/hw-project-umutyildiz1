package com.patikapaycoreumutyildiz.BookShop.Controller;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book/")
public class BookController {

    @Autowired
    private BookService bookService;
}
