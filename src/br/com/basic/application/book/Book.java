package br.com.basic.application.book;

public class Book {

    public Book() {
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    protected void priceIncrease(final double percentage) {
        price += price * percentage;
    }

    protected void priceDecrease(final double percentage) {
        price -= price * percentage;
    }

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