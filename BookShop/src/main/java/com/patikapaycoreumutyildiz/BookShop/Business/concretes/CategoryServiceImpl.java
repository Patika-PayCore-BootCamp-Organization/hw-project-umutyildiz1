package com.patikapaycoreumutyildiz.BookShop.Business.concretes;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.CategoryService;
import com.patikapaycoreumutyildiz.BookShop.DataAccess.CategoryRepository;
import com.patikapaycoreumutyildiz.BookShop.Entities.Category;
import com.patikapaycoreumutyildiz.BookShop.Exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategory(Integer id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.orElseThrow(() -> new NotFoundException("Category"));
    }

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public boolean deleteCategory(Integer id) {
        Optional<Category> category = Optional.of(getCategory(id));
        if(category.isPresent()){
            categoryRepository.delete(category.get());
            return true;
        }
        return false;
    }
}
