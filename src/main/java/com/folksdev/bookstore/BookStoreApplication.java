package com.folksdev.bookstore;

import com.folksdev.bookstore.model.Book;
import com.folksdev.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {


    public BookStoreApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}



	private final BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		Book book1= Book.builder()
				.name("Yüzüklerin Eefendisi")
				.author("J.R.R Tolkien")
				.price(10.0D)
				.stock(10).build();

		Book book2= Book.builder()
				.name("Yüzüklerin Eefendisi - 2")
				.author("J.R.R Tolkien")
				.price(11.0D)
				.stock(18).build();



		Book book3= Book.builder()
				.name("Yüzüklerin Eefendisi - 3")
				.author("J.R.R Tolkien")
				.price(12.0D)
				.stock(7).build();

		bookRepository.saveAll(Arrays.asList(book1, book2, book3));

}}
