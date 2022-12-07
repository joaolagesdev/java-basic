package br.com.basic.application;

import br.com.basic.application.book.Book;
import br.com.basic.application.book.Calculation;

public class Application {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Java 8");
        book.setAuthor("James Carter");
        book.setPages(230);
        book.setPrice(80d);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: " + book.getPrice());

        // book.priceIncrease(0.1);
        System.out.println("New Price: " + book.getPrice());

        System.out.println(book);

        Book newBook = new Book("Java 11", "Joseph Climber", "Tech", 25.90, 270);
        System.out.println(newBook);

        Calculation calculation = new Calculation(newBook);
        calculation.priceIncrease(0.5);
        System.out.println(newBook);
    }
}
