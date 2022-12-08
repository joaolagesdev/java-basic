package br.com.basic.application;

import br.com.basic.application.book.Book;
import br.com.basic.application.book.CalculateReadjustment;
import br.com.basic.application.digital.DigitalBook;
import br.com.basic.application.physical.PhysicalBook;

public class Application {

    private static final double PERCENTAGE_INCREASE = 0.2;

    private static final double PERCENTAGE_DECREASE = 0.1;

    public static void main(String[] args) {

        Book digitalBook = new DigitalBook("Java 11", "Joseph Climber", "Tech Java", 89.90, 270, "qrCode");
        Book physicalBook = new PhysicalBook("JavaScript", "John Carter", "Tech JS", 129.90, 190);

        System.out.println(digitalBook);

        CalculateReadjustment.priceIncrease(digitalBook, PERCENTAGE_INCREASE);
        System.out.println("Increase: " + digitalBook.getPrice());

        CalculateReadjustment.priceDecrease(digitalBook, PERCENTAGE_DECREASE);
        System.out.println("Decrease: " + digitalBook.getPrice());

        System.out.println(physicalBook);

        CalculateReadjustment.priceIncrease(physicalBook, PERCENTAGE_INCREASE );
        System.out.println("Increase: " + physicalBook.getPrice());

        CalculateReadjustment.priceDecrease(physicalBook, PERCENTAGE_DECREASE);
        System.out.println("Decrease: " + physicalBook.getPrice());
    }
}
