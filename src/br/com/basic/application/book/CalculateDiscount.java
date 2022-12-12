package br.com.basic.application.book;

public class CalculateDiscount implements Calculation{
    @Override
    public double priceIncrease(Book book, double percentage) {
        return 0;
    }

    @Override
    public double priceDecrease(Book book, double percentage) {
        book.priceDecrease(percentage);
        return book.getPrice();
    }
}
