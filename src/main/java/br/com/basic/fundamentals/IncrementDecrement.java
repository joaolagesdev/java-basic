package br.com.basic.fundamentals;

public class IncrementDecrement {

    public static void main(String[] args) {

        int i = 5;
        System.out.println(i);

        int aa = i++;
        System.out.println(aa);
        System.out.println(i);

        int bb = ++i;
        System.out.println(bb);
        System.out.println(i);

        int c = i--;
        System.out.println(c);
        System.out.println(i);

        int d = --i;
        System.out.println(d);
    }
}
