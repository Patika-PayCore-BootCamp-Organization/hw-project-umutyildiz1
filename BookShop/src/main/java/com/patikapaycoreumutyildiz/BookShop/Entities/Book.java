package com.patikapaycoreumutyildiz.BookShop.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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

}
