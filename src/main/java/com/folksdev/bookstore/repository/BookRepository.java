package com.folksdev.bookstore.repository;

import com.folksdev.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookRepository extends JpaRepository<Book,Integer> {
    //bundan başka içersiine hiç bir şey yazmaya gerek yok jpa bizim için bütün hazır yapıları oluşturuyor
}
