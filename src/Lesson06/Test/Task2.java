package Lesson06.Test;

/**
 * Created by Vitaliy Tsvetkov on 15.07.2017.
 */

//•	Write a method that accepts two parameters: mode of type String and length of type int.
//•	This function should return a randomly generated string of given length according to the specified mode.
//•	Modes: alpha, numeric, alphanumeric
//•	Output —> String.

public class Task2 {
    public static void main(String[] args) {

        System.out.println(randomString("alpha", 10));
        System.out.println(randomString("alpha", 10));
        System.out.println(randomString("alpha", 10));
        System.out.println(randomString("numeric", 10));
        System.out.println(randomString("numeric", 10));
        System.out.println(randomString("numeric", 10));
        System.out.println(randomString("alphanumeric", 10));
        System.out.println(randomString("alphanumeric", 10));
        System.out.println(randomString("alphanumeric", 10));
    }

    public static String randomString(String mode, int length) {
        String randomString = "";
        String alphabet;

        switch (mode) {
            case "alpha":
                alphabet = "abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRSTUVWXYZ";
                break;
            case "numeric":
                alphabet = "0123456789";
                break;
            case "alphanumeric":
                alphabet = "abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                break;
            default:
                throw new RuntimeException("No such mode");
        }
        int alphabetLength = alphabet.length();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * alphabetLength);
            randomString += alphabet.charAt(index);
        }
        return randomString;
    }
}
