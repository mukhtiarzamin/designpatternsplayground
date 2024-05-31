package com.example.tdd;

import java.util.List;

public class FakeRepositoryForTest implements IBookRepository{
    public static List<Book> booksList;

    @Override
    public List<Book> findAllBooks() {
        return booksList;
    }
}
