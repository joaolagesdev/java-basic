package br.com.basic.application.datasource;

import br.com.basic.application.book.Book;

import java.util.List;

/**
 * @version 1.0
 * @Author Joao
 * @since 14/12/2022
 */
public interface IBookDataSource {

    /**
     * Get all books from database
     *
     * @return java.util.List @see br.com.basic.application.book.Book
     */
    List<Book> getBooks();
}
