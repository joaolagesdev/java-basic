package br.com.basic.fundamentals.exercices;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String text = "Repeated Characters";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("1. Numbers characters = a': " + count);

        char[] chars = text.toCharArray();

        for (char a : chars) {
            if (a == 'a') count++;
        }

        System.out.println("2. Numbers characters = a': " + count);
    }
}
