package com.patikapaycoreumutyildiz.BookShop.Controller;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.CartBookService;
import com.patikapaycoreumutyildiz.BookShop.Entities.Cart;
import com.patikapaycoreumutyildiz.BookShop.Entities.CartBook;
import com.patikapaycoreumutyildiz.BookShop.Entities.CartBookId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cart-book/")
public class CartBookController {

    @Autowired
    private CartBookService cartBookService;

    @GetMapping("all")
    public List<CartBook> getAllCartBooks() {
        return cartBookService.getAllCartBooks();
    }

    @GetMapping("get")
    public CartBook getCartBook(@RequestBody @Valid CartBookId cartBookId) {
        return cartBookService.getCartBook(cartBookId);
    }

    @PostMapping("create")
    public void addCartBook(@RequestBody @Valid CartBook cartBook) {
        cartBookService.addCartBook(cartBook);
    }

    @PutMapping("update")
    public CartBook updateCartBook(@RequestBody @Valid CartBook cartBook) {
        return cartBookService.updateCartBook(cartBook);
    }

    @DeleteMapping("delete")
    public boolean deleteCartBook(@RequestBody @Valid CartBookId cartBookId){
        return cartBookService.deleteCartBook(cartBookId);
    }
}
