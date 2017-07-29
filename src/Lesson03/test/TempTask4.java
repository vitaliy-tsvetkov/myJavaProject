package Lesson03.test;

/**
 * Created by Vitaliy Tsvetkov on 02.07.2017.
 */
public class TempTask4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
