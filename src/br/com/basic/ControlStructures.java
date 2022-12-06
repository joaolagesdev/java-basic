package br.com.basic;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class ControlStructures {
    public static void main(String[] args) {

        boolean condition = false;

        if (condition) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }

        int number = 15;

        if (number > 10) {
            System.out.println("number > 10");
        } else if (number == 10) {
            System.out.println("number = 10");
        } else if (number < 10) {
            System.out.println("number < 10");
        }

        int option = 5;

        switch (option) {
            case 1:
                System.out.println("Option: " + option);
                break;
            case 2:
                System.out.println("Option: " + option);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        int age = 10;

        System.out.println(age >=18 ? "age > 18" : "age < 18");
    }
}
