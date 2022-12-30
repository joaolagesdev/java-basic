package br.com.basic.application.physical;

import br.com.basic.application.book.Book;

public class PhysicalBook extends Book {

    private static final double PHYSICAL_RATE = 0.07d ;

    public PhysicalBook(String title, String author, String publishingCompany, double price, int pages) {
        super(title, author, publishingCompany, price, pages);
    }

    @Override
    public String getBookCover() {
        return "www.book.com/physicalbook/cover.png";
    }

    @Override
    protected void priceIncrease(double percentage) {
        double newPercentage = percentage + PHYSICAL_RATE;
        setPrice(getPrice() + getPrice() * newPercentage);
    }

    @Override
    protected void priceDecrease(double percentage) {
        double newPercentage = percentage + PHYSICAL_RATE;
        setPrice(getPrice() - getPrice() * newPercentage);
    }

    @Override
    public String toString() {
        return "PhysicalBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", publishingCompany='" +getPublishingCompany() + '\'' +
                ", price=" + getPrice() +
                ", pages=" + getPages() +
                '}';
    }
}
