package br.com.basic.application.book;

public abstract class Book {

    public Book(String title, String author, String publishingCompany, double price, int pages) {
        this.title = title;
        this.author = author;
        this.publishingCompany = publishingCompany;
        this.price = price;
        this.pages = pages;
    }

    private String title;
    private String author;
    private String publishingCompany;
    private double price;
    private int pages;

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public abstract String getBookCover();

   protected abstract void priceIncrease(final double percentage);

    protected abstract void priceDecrease(final double percentage);

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", price=" + price +
                ", pages=" + pages +
                '}';
    }
}
