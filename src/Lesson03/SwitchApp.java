package Lesson03;

/**
 * Created by Vitaliy Tsvetkov on 02.07.2017.
 */
public class SwitchApp {
    public static void main(String[] args) {
        String season = "Summer";

        switch (season) {
            case "Winter":
                System.out.println("This is winter");
                break;
            case "Spring":
                System.out.println("This is spring");
                break;
            case "Summer":
                System.out.println("This is summer");
                break;
            case "Autumn":
                System.out.println("This is autumn");
                break;
            default:
                System.out.println("Oops");
        }

        System.out.println("Other program code");
    }
}
