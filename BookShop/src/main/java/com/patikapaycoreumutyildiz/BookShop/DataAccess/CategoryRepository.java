package com.patikapaycoreumutyildiz.BookShop.DataAccess;

import com.patikapaycoreumutyildiz.BookShop.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
