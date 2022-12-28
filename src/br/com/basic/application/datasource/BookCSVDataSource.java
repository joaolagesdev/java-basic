package br.com.basic.application.datasource;

import br.com.basic.application.book.Book;
import br.com.basic.application.physical.PhysicalBook;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BookCSVDataSource implements IBookDataSource {

    public static final int POSITION_PUBLISHING_COMPANY = 4;
    public static final int POSITION_PRICE = 3;
    private static final String BOOKS_CSV = "\\books.csv";
    private static final int POSITION_TITLE = 0;
    public static final int POSITION_AUTHOR = 1;

    @Override
    public List<Book> getBooks() {
        var books = new ArrayList<Book>();
        var csvFilePath = Paths.get(System.getProperty("user.dir") + BOOKS_CSV);

        try {
            var lines = Files.readAllLines(csvFilePath, StandardCharsets.UTF_8);

            lines.stream().forEach(line -> {
                String[] split = line.split(",");
                Book book = new PhysicalBook(
                        split[POSITION_TITLE],
                        split[POSITION_AUTHOR],
                        split[POSITION_PUBLISHING_COMPANY],
                        Math.random(),
                        Integer.parseInt(split[POSITION_PRICE]));
                books.add(book);
            });
            return books;
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException("Could not read the file CSV");
        }
    }

    @Override
    public Optional<Book> getBooks(String title) {
        var books = getBooks();
        return books.stream().filter(book -> book.getTitle().contains(title)).findFirst();
    }
}

// Remove test
//books.removeIf(b -> {return b.getTitle().equalsIgnoreCase("Data Mining Handbook");});