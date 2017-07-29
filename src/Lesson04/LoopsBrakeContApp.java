package Lesson04;

/**
 * Created by Vitaliy Tsvetkov on 04.07.2017.
 */
public class LoopsBrakeContApp {
    public static void main(String[] args) {
        //1. For + break
        System.out.println("1. For + break");
        for (int i = 1; i < 10; i++) {
            if (i % 7 == 0)
                break;
            System.out.println(i);
        }
        System.out.println("Other program code 1\n");

        //2. For + continue
        System.out.println("1. For + continue");
        for (int j = 1; j < 10; j++) {
            if (j % 2 != 0)
                continue;
            System.out.println(j);
        }
        System.out.println("Other program code 2\n");

    }
}
