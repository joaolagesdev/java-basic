package br.com.basic.application.book;

public class CalculateReadjustment implements Calculation {

    public CalculateReadjustment() {}

    @Override
    public double priceIncrease (final Book book, final double percentage) {
        book.priceIncrease(percentage);
        return book.getPrice();
    }

    @Override
    public double priceDecrease (final Book book, final double percentage) {
        book.priceDecrease(percentage);
        return book.getPrice();
    }
}
