package Lesson06;

/**
 * Created by Vitaliy Tsvetkov on 14.07.2017.
 */
public class StringApp2 {
    public static void main(String[] args) {
        String str = "Hello";

        String str1 = str.toUpperCase();
        String str2 = str1.concat(" WORLD");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2.toLowerCase());
        System.out.println(str2);

        String str3 = str.replaceAll("\\D", "kk");
        System.out.println(str);
        System.out.println(str3);
    }
}

