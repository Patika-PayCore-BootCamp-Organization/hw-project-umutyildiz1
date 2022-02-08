package com.patikapaycoreumutyildiz.BookShop.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Table(name = "Customer")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "customer_name")
    @NotBlank(message = "Name can not be blank or null")
    private String customerName;

    @Column(name = "surname")
    @NotBlank(message = "Surname can not be blank or null")
    private String surname;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    @NotBlank(message = "Email can not be blank or null")
    private String email;
}
