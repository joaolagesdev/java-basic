package br.com.basic.application.book;

public class Calculation {

    private Book book;

    public Calculation(Book book) {
        this.book = book;
    }

    public double priceIncrease (final double percentage) {
        book.priceIncrease(percentage);
        return book.getPrice();
    }

}
