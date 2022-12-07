package br.com.basic.application;

import br.com.basic.application.book.Book;
import br.com.basic.application.book.Calculation;

public class Application {

    private static final double PERCENTAGE_INCREASE = 0.3;

    private static final double PERCENTAGE_DECREASE = 0.5;

    public static void main(String[] args) {

        Book book = new Book("Java 11", "Joseph Climber", "Tech", 25.90, 270);
        System.out.println(book);

        Calculation.priceIncrease(book, PERCENTAGE_INCREASE);
        System.out.println("Increase: " + book.getPrice());

        Calculation.priceDecrease(book, PERCENTAGE_DECREASE);
        System.out.println("Decrease: " + book.getPrice());
    }
}
