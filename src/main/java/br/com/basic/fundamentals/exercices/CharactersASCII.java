package br.com.basic.fundamentals.exercices;

public class CharactersASCII {
    public static void main(String[] args) {
        printCharactersAscII(32, 255);
    }

    public static void printCharactersAscII(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println("Code: " + i + " Character: " + (char) i);
        }
    }
}
