package com.patikapaycoreumutyildiz.BookShop.Business.abstracts;

import com.patikapaycoreumutyildiz.BookShop.Entities.Book;
import com.patikapaycoreumutyildiz.BookShop.Entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategory(Integer id);
    void addCategory(Category category);
    Category updateCategory(Category category);
    boolean deleteCategory(Integer id);
}
