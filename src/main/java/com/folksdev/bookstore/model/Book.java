package com.folksdev.bookstore.model;



import jakarta.persistence.*;
import lombok.*;


@Data
@Getter
@Setter
@Builder
@Entity(name = "bookstore")
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String author;
    private Double price;
    private Integer stock;


}
