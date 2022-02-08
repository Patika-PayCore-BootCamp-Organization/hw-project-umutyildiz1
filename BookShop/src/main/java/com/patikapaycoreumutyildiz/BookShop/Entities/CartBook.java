package com.patikapaycoreumutyildiz.BookShop.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "Cart_Book")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartBook {

    @EmbeddedId
    private CartBookId cartBookId;
}
