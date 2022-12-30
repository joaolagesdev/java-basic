package br.com.basic.application.book;

public interface Calculation {
    double priceIncrease(final Book book, final double percentage);

    double priceDecrease(final Book book, final double percentage);
}
