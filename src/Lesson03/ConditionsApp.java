package Lesson03;

/**
 * Created by Vitaliy Tsvetkov on 02.07.2017.
 */
public class ConditionsApp {
    public static void main(String[] args) {
        int a = 6;

        if (a == 5) {
            System.out.println("Condition matched");
        } else if (a < 4){
            System.out.println("Else executed");
        } else if (a >= 7) {
            System.out.println("smth");
        } else {
            System.out.println("Else");
        }
        System.out.println("Other condition");
    }
}
