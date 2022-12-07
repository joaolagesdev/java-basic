package br.com.basic.fundamentals;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {23, 46, 2, 125};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Position: " + i + " Value: " + numbers[i]);
        }

        System.out.println("--------------------------------");

        for(int number : numbers) {
            System.out.println("Value: " + number);
        }
    }
}
