package Lesson05000;

/**
 * Created by Vitaliy Tsvetkov on 08.07.2017.
 */
public class MethodsApp1 {
    public static void main(String[] args) {
        System.out.println(isEven(7));
        System.out.println(isEven(4));
        System.out.println(isEven(75));
        System.out.println(isEven(0));

        System.out.println(isEven(10, 5));
        System.out.println(isEven(1, 1));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isEven(int number, int divider) {
        return (number / divider) % 2 == 0;
    }
}