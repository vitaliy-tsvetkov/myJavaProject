package Lesson04;

/**
 * Created by Vitaliy Tsvetkov on 04.07.2017.
 */
public class LoopsApp {
    public static void main(String[] args) {
        //1. For
        System.out.println("1. For");
        for (int i = 10; i > 0; i = i - 3) {
            System.out.println(i);
        }
        System.out.println("Other program code 1\n");

        //2. While
        System.out.println("2. While");
        int j = 10;
        while (j > 0) {
            System.out.println(j);
            j -= 2; //аналогично j = j - 2;
        }
        System.out.println("Other program code 2\n");

        //3. Do...while
        System.out.println("3. Do...while");
        int k = -10;
        do {
            System.out.println(k);
            k -= 2;

        } while (k > 0);
        System.out.println("Other program code 3\n");
    }
}
