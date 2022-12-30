package br.com.basic.fundamentals.exercices;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.print("Hello, type any number on the keyboard: ");
        int number = readKeyboard();

        System.out.println(compareNumberWithRandomNumber(randomNumber, number));
    }

    public static int readKeyboard() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();
        return Integer.parseInt(option);
    }

    public static String compareNumberWithRandomNumber(int randomNumber, int number) {
        if (randomNumber == number) {
            return randomNumber + " equals " + number;
        }
        return randomNumber > number ? (randomNumber + " > " + number) : (randomNumber + " < " + number);
    }
}
