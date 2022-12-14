package br.com.basic.exercices;

import java.util.OptionalInt;

import static java.util.Arrays.stream;

public class Method {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 4, 6, 9, 5, 10};
        System.out.println(numberExistsInArray(numbers, 9));
    }

    public static boolean numberExistsInArray(int[] numbers, int number) {
        for(int n : numbers)
            if (n == number) {
                return true;
        }
        return false;
    }
}
