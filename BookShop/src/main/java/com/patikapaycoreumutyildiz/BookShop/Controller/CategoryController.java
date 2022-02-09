package com.patikapaycoreumutyildiz.BookShop.Controller;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.CategoryService;
import com.patikapaycoreumutyildiz.BookShop.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/api/category/")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("all")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("{id}")
    public Category getCategory(@PathVariable @Min(1) Integer id){
        return categoryService.getCategory(id);
    }

    @PostMapping("create")
    public void createCategory(@RequestBody @Valid Category category){
        categoryService.addCategory(category);
    }

    @PutMapping("update")
    public Category updateCategory(@RequestBody Category category){
        return categoryService.updateCategory(category);
    }

    @DeleteMapping("delete")
    public boolean deleteCategory(@RequestParam @Min(1) Integer id){
        return categoryService.deleteCategory(id);
    }
}
