package com.example.tdd;

import java.util.Arrays;
import java.util.List;

public class BookRepository implements IBookRepository {

    @Override
    public List<Book> findAllBooks() {
        return Arrays.asList(
                new Book("1", "Test Driven Development", "Kent Beck"),
                new Book("2", "Clean Code", "Robert C. Martin"),
                new Book("3", "Effective Java", "Joshua Bloch"),
                new Book("4", "Refactoring", "Martin Fowler")
        );
    }
}
