package br.com.basic.application;

import br.com.basic.application.book.Book;
import br.com.basic.application.book.CalculateDiscount;
import br.com.basic.application.book.CalculateReadjustment;
import br.com.basic.application.book.Calculation;
import br.com.basic.application.datasource.IBookDataSource;
import br.com.basic.application.digital.DigitalBook;
import br.com.basic.application.exceptions.CalculateNotFoundException;
import br.com.basic.application.factory.BookFactory;
import br.com.basic.application.factory.SourceBookEnum;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {

    private static final double PERCENTAGE_INCREASE = 0.2;

    private static final double PERCENTAGE_DECREASE = 0.1;

    private static final int FIND_BOOKS = 1;

    private static final int FIND_BOOK = 2;
    private static final int PRICE_CHANGE_BOOKS = 3;

    public static void main(String[] args) {

        System.out.println("Hello \n[1]Search books\n[2]Search book\n[3]Readjustment calculation");
        int option = readKeyboard();

        if (option == FIND_BOOKS) {
            System.out.println("What is the name of the book? ");
            var word = readStringKeyboard();
            var bookFactory = BookFactory.createBookFactory(SourceBookEnum.CSV);
            var books = bookFactory.getBooks();
            List<Book> filteredBooks = books.stream().filter(book -> {
                return book.getTitle().contains(word);
            }).collect(Collectors.toList());
            System.out.println("FilteredBooks:");
            /*filteredBooks.forEach(book -> {
                System.out.println(book.getTitle() + " - " + book.getAuthor());
            });*/
            filteredBooks.forEach(System.out::println);
        }

        if(option == FIND_BOOK) {
            System.out.println("What is the name of the book? ");
            var word = readStringKeyboard();
            var bookFactory = BookFactory.createBookFactory(SourceBookEnum.CSV);
            Optional<Book> optionalBook = bookFactory.getBooks(word);
            optionalBook.ifPresentOrElse(System.out::println, () -> {
                throw new RuntimeException("Book not found: " + word);
            });
        }

        if (option == PRICE_CHANGE_BOOKS) {
            calculatePriceChange();
        }
    }

    private static void calculatePriceChange() {
        try {

            int option = readKeyboard();

            Calculation calculation = null;

            if (option == 1) {
                calculation = new CalculateReadjustment();
            } else if (option == 2) {
                calculation = new CalculateDiscount();
            }

            if (calculation != null) {

                Book digitalBook = new DigitalBook("Java 11", "Joseph Climber", "Tech Java", 89.90, 270, "qrCode");

                System.out.println("Book price: " + digitalBook.getPrice());

                if (option == 1) {
                    calculation.priceIncrease(digitalBook, PERCENTAGE_INCREASE);
                } else if (option == 2) {
                    calculation.priceDecrease(digitalBook, PERCENTAGE_DECREASE);
                }

                System.out.println("New price: : " + digitalBook.getPrice());
            }

            throw new CalculateNotFoundException("The application is not prepared to perform this calculation");

        } catch (NumberFormatException | CalculateNotFoundException ex) {
            ex.printStackTrace();
            System.err.println(ex.getMessage());
            System.exit(0);
        }
    }

    public static int readKeyboard() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();
        return Integer.parseInt(option);
    }

    public static String readStringKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
