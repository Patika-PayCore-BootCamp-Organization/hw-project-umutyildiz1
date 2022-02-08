package com.patikapaycoreumutyildiz.BookShop.DataAccess;

import com.patikapaycoreumutyildiz.BookShop.Entities.CartBook;
import com.patikapaycoreumutyildiz.BookShop.Entities.CartBookId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartBookRepository extends JpaRepository<CartBook,CartBookId> {
}
