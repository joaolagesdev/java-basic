package br.com.basic.application.digital;

import br.com.basic.application.book.Book;

public class DigitalBook extends Book {

    private static final double VIRTUAL_RATE = 0.050d;
    String qrCode;

    public DigitalBook(String title, String author, String publishingCompany, double price, int pages, final String qrCode) {
        super(title, author, publishingCompany, price, pages);
        this.qrCode = qrCode;
    }

    @Override
    public String getBookCover() {
        return "www.book.com/digitalbook/cover.png";
    }

    @Override
    protected void priceIncrease(double percentage) {
        System.out.println(getClass().getSimpleName() + ": " + percentage);
        double newPercentage = percentage + VIRTUAL_RATE;
        System.out.println(getClass().getSimpleName() + ": " + newPercentage);
        setPrice(getPrice() + getPrice() * newPercentage);
    }

    @Override
    protected void priceDecrease(double percentage) {
        System.out.println(getClass().getSimpleName() + ": " + percentage);
        double newPercentage = percentage + VIRTUAL_RATE;
        System.out.println(getClass().getSimpleName() + ": " + newPercentage);
        setPrice(getPrice() - getPrice() * newPercentage);
    }

    @Override
    public String toString() {
        return "DigitalBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", publishingCompany='" + getPublishingCompany() + '\'' +
                ", pages='" + getPages() + '\'' +
                ", qrCode=" + qrCode
                +
                '}';
    }
}
