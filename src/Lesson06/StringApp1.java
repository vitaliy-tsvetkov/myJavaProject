package Lesson06;

/**
 * Created by Vitaliy Tsvetkov on 14.07.2017.
 */
public class StringApp1 {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = new String("hello");
        String str2 = new String("Hello world");

        System.out.println(str);
        System.out.println(str1);

        System.out.println(str == str1);
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str2.contains(str));
    }
}