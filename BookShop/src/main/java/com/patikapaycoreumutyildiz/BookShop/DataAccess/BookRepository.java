package com.patikapaycoreumutyildiz.BookShop.DataAccess;

import com.patikapaycoreumutyildiz.BookShop.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
