package com.example.tdd;

import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findAllBooks().stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
}
