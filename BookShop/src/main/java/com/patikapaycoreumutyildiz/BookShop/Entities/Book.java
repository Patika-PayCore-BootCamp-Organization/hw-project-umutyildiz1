package com.patikapaycoreumutyildiz.BookShop.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Table(name = "Book")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @Column(name = "ISBN")
    @NotBlank
    @Size(min = 13,max = 13,message = "ISBN cannot be less than or more than 13 digits")
    private int ISBN;

    @Column(name = "author_name")
    private String authorName;

    @Column(name = "title")
    @NotBlank(message = "Title can not be null")
    private String title;

    @Column(name = "price")
    @NotBlank(message = "Price can not be null")
    private int price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @JsonIgnore
    @OneToMany(mappedBy = "cartBookId.book")
    private List<CartBook> cartBookList;

}
