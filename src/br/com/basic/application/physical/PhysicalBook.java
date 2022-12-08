package br.com.basic.application.physical;

import br.com.basic.application.book.Book;

public class PhysicalBook extends Book {

    private static final double PHYSICAL_RATE = 0.07d ;

    public PhysicalBook(String title, String author, String publishingCompany, double price, int pages) {
        super(title, author, publishingCompany, price, pages);
    }

    @Override
    protected void priceIncrease(double percentage) {
        System.out.println(getClass().getSimpleName() + ": " + percentage);
        double newPercentage = percentage + PHYSICAL_RATE;
        System.out.println(getClass().getSimpleName() + ": " + newPercentage);
        super.priceIncrease(percentage +  PHYSICAL_RATE);
    }
}
