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

import java.util.Scanner;

public class Application {

    private static final double PERCENTAGE_INCREASE = 0.2;

    private static final double PERCENTAGE_DECREASE = 0.1;

    public static void main(String[] args) {

        System.out.print("Hello, enter 1 for readjustment calculation or 2 for discount: ");
        int option = readKeyboard();

        if (option == 1) {
            IBookDataSource bookFactory = BookFactory.createBookFactory(SourceBookEnum.CSV);
            bookFactory.getBooks();
        } else if (option == 2) {
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
}
