package Lesson02Hometask;
import java.util.Scanner;
import static java.lang.Math.*;

/**
 * Created by Vitaly Tsvetkov on 28.06.2017.
 */
public class MathApp {
    public static void main(String[] args) {

// Запрос и ввод значения переменной X
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение переменной х: ");
        int x = in.nextInt();

// Расчет переменной Y
        double y9 = (1.1 * pow(E,-x) + abs(cos(sqrt(PI * x))) - 3/8);
        double y10 = (1/3) * sqrt(abs(sin(x))) * pow(pow(E,0.12 * x),1/3);
        double y11 = 2 * PI * x - abs(sin(sqrt(10.5 * x))) * (1/(pow(pow(x,2),3) + 1/7));
        double y12 = log(sqrt(abs(2 - x)) + 1.2) * (1/(2 + pow(E,-x))) + pow(2/x,3);
        double y13 = (pow(pow(E,-2 + x),1./5)) * (1/sqrt(pow(x,2) + pow(x,4)+ log(abs(x - PI))));
        double y14 = (sqrt(pow(sin(x/2),3)) + pow((pow(E,1.3 * x) + pow(E,-1.3 * x)),1./3)) * (1/abs(x + 5/2));
        double y15 = (abs(x * log(x) - 4) * sqrt(x)) * (1/pow(pow(E,4 * x - 1),1./5));
        double y16 = (pow(pow(E,2 * x) * sqrt(x) - (x + 1/3)/x,1./3))*(abs(cos(2.5 * x)));
        double y17 = (pow(x,3)/3) - (pow(E,x) * log(abs(pow(1.3,3) + pow(x,3))));
        double y18 = ((abs(7.2 - 10 * x)) / (pow(pow(x,2) + pow(E,x),1./3))) * atan((4 * (x/3)) / (sqrt(pow(1.1,3) + pow(x,2))));
        double y19 = acos(tan((5 * x)/PI)) + pow(x,3.2)/28;
        double y20 = (pow(pow(log(x),2),1./3) + tan(cos(PI * x))) * abs(log(x/10.5) + 1/3);
        double y21 = (pow(log10(x),4) + acos(x + 3)) * (1/abs(x + 2 * pow(x,2)));
        double y22 = asin(log10(x) / (pow(x,2) + 5 * x + 1)) - pow(x,3.2)/28;
        double y23 = acos(tan((5 * x)/PI)) + pow(x,5.7)/23;
        double y24 = atan(abs(8.3 - 21 * pow(x,2) - 0.8 * x) / pow(2.5 + 1/pow(x,2),1./3));
        double y25 = pow(log10(acos(abs(pow(x,3.4) + 2.5 * pow(x,1.2) - 0.7) / pow(pow(E,2.5 * x),1./3))),1./4) + 1;
        double y26 = log(abs(sin(x))) + 2 * pow(E,x) + 2 * cos(abs(x)) + 2;

// Вывод результатов
        System.out.println("\nДано: x = " + x + "\n");
        System.out.println("Задача  #9, ответ: y = " + y9);
        System.out.println("Задача #10, ответ: y = " + y10);
        System.out.println("Задача #11, ответ: y = " + y11);
        System.out.println("Задача #12, ответ: y = " + y12);
        System.out.println("Задача #13, ответ: y = " + y13);
        System.out.println("Задача #14, ответ: y = " + y14);
        System.out.println("Задача #15, ответ: y = " + y15);
        System.out.println("Задача #16, ответ: y = " + y16);
        System.out.println("Задача #17, ответ: y = " + y17);
        System.out.println("Задача #18, ответ: y = " + y18);
        System.out.println("Задача #19, ответ: y = " + y19);
        System.out.println("Задача #20, ответ: y = " + y20);
        System.out.println("Задача #21, ответ: y = " + y21);
        System.out.println("Задача #22, ответ: y = " + y22);
        System.out.println("Задача #23, ответ: y = " + y23);
        System.out.println("Задача #24, ответ: y = " + y24);
        System.out.println("Задача #25, ответ: y = " + y25);
        System.out.println("Задача #26, ответ: y = " + y26);

    }
}