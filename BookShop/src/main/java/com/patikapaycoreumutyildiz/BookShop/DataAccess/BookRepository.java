package com.patikapaycoreumutyildiz.BookShop.DataAccess;

import com.patikapaycoreumutyildiz.BookShop.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
