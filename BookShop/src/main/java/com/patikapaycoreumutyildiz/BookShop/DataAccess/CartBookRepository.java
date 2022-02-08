package com.patikapaycoreumutyildiz.BookShop.DataAccess;

import com.patikapaycoreumutyildiz.BookShop.Entities.CartBook;
import com.patikapaycoreumutyildiz.BookShop.Entities.CartBookId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartBookRepository extends JpaRepository<CartBook,CartBookId> {
}
