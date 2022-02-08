package com.patikapaycoreumutyildiz.BookShop.Exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String s) {
        super(s + "not found...!");
    }
}
