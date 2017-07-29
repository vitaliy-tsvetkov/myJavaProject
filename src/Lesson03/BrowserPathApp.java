package Lesson03;

/**
 * Created by Vitaliy Tsvetkov on 02.07.2017.
 */
public class BrowserPathApp {
    public static void main(String[] args) {
        String temp = System.getenv("testBrowser");

        switch (temp) {
            case "Microsoft IE":
                System.out.println("Microsoft IE is selected");
                break;
            case "Google Chrome":
                System.out.println("Google Chrome is selected");
                break;
            case "Mozilla FF":
                System.out.println("Mozilla FF is selected");
                break;
            default:
                System.out.println("Other browser is selected");
        }

        System.out.println("DONE");
    }
}
