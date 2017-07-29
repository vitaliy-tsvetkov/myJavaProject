package Lesson06.Test;

/**
 * Created by Vitaliy Tsvetkov on 15.07.2017.
 */

//•	Write method valueOrDefault()
//•	It accepts 2 String parameters - EnvVar and default value
//•	It returns String if EnvVar is present then its value or default value

public class Task1 {
    public static void main(String[] args) {
        String def = "default";
        System.out.println(valueOrDefault("testBrowser", "Google Chrome"));
    }

    public static String valueOrDefault (String envVar, String def) {
        return System.getenv(envVar) != null ? System.getenv(envVar) : def;
    }
}