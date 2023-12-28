package com.example.goodreads;

import java.util.ArrayList;
import com.example.goodreads.Book;

public interface BookRepository {

    ArrayList<Book> getBooks();

    Book getBookId(int bookId);

    Book addBook(Book book);
}