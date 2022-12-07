package br.com.basic;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] numbers;
        numbers = new int[10][10];
        System.out.println(numbers[5][5]);

        System.out.println("--------------------------------");

        char[][] chars = new char[3][3];
        chars[0][2] = 'O';
        chars[0][0] = 'X';
        chars[1][2] = 'O';
        chars[0][2] = 'X';
        chars[2][2] = 'O';

        for (int column = 0; column < 3; column++) {
            for (int line = 0; line < chars.length; line++) {
                System.out.println(chars[line][column]);
            }
        }

        System.out.println("--------------------------------");

        for (int line2 = 0; line2 < chars.length; line2++) {
            System.out.println(chars[0][line2] + "|" + chars[1][line2] + "|" + chars[2][line2]);
        }
    }
}
