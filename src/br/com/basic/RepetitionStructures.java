package br.com.basic;

public class RepetitionStructures {
    public static void main(String[] args) {

        // While
        int number = 0;

        while (number < 10) {

            if (number == 5) {
                break;
            }

            System.out.println("Number: " + number);
            number++;
        }

        //Do-While
        int numberDoWhile = 0;

        do {
            System.out.println("NumberDoWhile: " + numberDoWhile);
            numberDoWhile++;
        } while (numberDoWhile <= 10);

        // For
        for (int i = 0; i <= 10; i++) {
            System.out.println("NumberFor: " + i);
        }
    }
}
