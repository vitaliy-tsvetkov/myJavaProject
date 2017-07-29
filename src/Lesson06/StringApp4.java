package Lesson06;

import java.util.Arrays;

/**
 * Created by Vitaliy Tsvetkov on 14.07.2017.
 */
public class StringApp4 {
    public static void main(String[] args) {
        String str = "Hello world from java program";
        String[] array = str.split(" ");

        System.out.println(str.length());
//        str = str.replace(" ", "");

        System.out.println(str.charAt(15));
        System.out.println(str.codePointAt(15));
        System.out.println(str.length());
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.indexOf("from"));
    }
}

