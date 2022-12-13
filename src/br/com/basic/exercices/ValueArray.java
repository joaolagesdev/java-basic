package br.com.basic.exercices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;

public class ValueArray {
    public static void main(String[] args) {
        int[] numbers = fillArray();
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length -2]);
    }

    public static int[] fillArray() {
        Random random = new Random();
        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(500);
        }
        return numbers;
    }

}

