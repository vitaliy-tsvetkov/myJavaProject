package Lesson05000.Test;

/**
 * Created by Vitaliy Tsvetkov on 08.07.2017.
 */
public class PaintApp {
    public static void main(String[] args) {
        char a = '#';

//возрастающая лесенка
        System.out.println("1. возрастающая лесенка");
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }

//убывающая лесенка
        System.out.println("\n\n2. убывающая лесенка");
        for (int i = 0; i < 8; i++) {
            for (int j = 8; j > i; j--) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }

//убывающая лесенка
        System.out.println("\n\n3. убывающая лесенка (инверсия)");
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                a = '#';
            } else {
                a = ' ';
            }

            for (int j = 0; j < i; j++) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }

    }
}