package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer{
    @Id
    // @see https://teratail.com/questions/124945
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
}