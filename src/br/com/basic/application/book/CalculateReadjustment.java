package br.com.basic.application.book;

public class CalculateReadjustment {

    private CalculateReadjustment() {}

    public static double priceIncrease (final Book book, final double percentage) {
        book.priceIncrease(percentage);
        return book.getPrice();
    }

    public static double priceDecrease (final Book book, final double percentage) {
        book.priceDecrease(percentage);
        return book.getPrice();
    }
}
