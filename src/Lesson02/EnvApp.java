package Lesson02;

import java.nio.file.Path;

/**
 * Created by Admin on 27.06.2017.
 */
public class EnvApp {
    public static void main(String[] args) {
        System.out.println(System.getenv("Path"));
        System.out.println();
        System.out.println(System.getenv("myEnv"));
        System.out.println(System.getenv(args[0]));
    }
}
