package com.patikapaycoreumutyildiz.BookShop.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
//Composite Key Class Implementation
public class CartBookId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "ISBN")
    private Book book;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartBookId that = (CartBookId) o;
        return cart.equals(that.cart) && book.equals(that.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cart, book);
    }


}
