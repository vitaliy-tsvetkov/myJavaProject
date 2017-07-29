package Lesson03Hometask;

import java.util.Scanner;
import static java.lang.StrictMath.*;

/**
 * Created by Vitaliy Tsvetkov on 01.07.2017.
 */

/* 1. Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than
or equal to 50; or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.*/
class CheckPassFail {
    public static void main(String[] args) {
        Scanner passFail = new Scanner (System.in);
        System.out.println("Введите оценку:");
        int mark = passFail.nextInt();

        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("\nDONE");
    }
}

/* 2. Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or
“Even Number” otherwise. The program shall always print “BYE!” before exiting.*/
class CheckOddEven {
    public static void main(String[] args) {
        Scanner evenOdd = new Scanner (System.in);
        System.out.println("Введите число:");
        int number = evenOdd.nextInt();

        if (number % 2 == 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
        System.out.println("\nBYE!");
    }
}

/* 3. Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int
variable "number" is 1, 2,... , 9, or other, respectively. Use
(a) a "nested-if" statement;
(b) a "switch-case" statement.*/
class PrintNumberInWord {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 11");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println("Выберете метод 1 - Nested-If, 2 - Switch. Сделайте ваш выбор (1/2):");
        int method = in.nextInt();

        if (method == 1) {  // работаем через nested-if
            if (number == 1) {
                System.out.println("ONE");
            }
            if (number == 2) {
                System.out.println("TWO");
            }
            if (number == 3) {
                System.out.println("THREE");
            }
            if (number == 4) {
                System.out.println("FOUR");
            }
            if (number == 5) {
                System.out.println("FIVE");
            }
            if (number == 6) {
                System.out.println("SIX");
            }
            if (number == 7) {
                System.out.println("SEVEN");
            }
            if (number == 8) {
                System.out.println("EIGHT");
            }
            if (number == 9) {
                System.out.println("NINE");
            }
            if (number < 1 || number > 9) {
                System.out.println("OTHER");
            }

        } else { // работаем через switch
            switch (number) {
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                default:
                    System.out.println("OTHER");
            }
        }
    }
}

/* 4. Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday” if the int
variable "day" is 0, 1, ..., 6, respectively. Otherwise, it shall print “Not a valid day”. Use
(a) a "nested-if" statement;
(b) a "switch-case" statement.*/
class PrintDayInWord {
    public static void main(String[] args) {
        System.out.println("Введите номер дня недели, где 0 - \"Sunday\":");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println("Выберете метод 1 - Nested-If, 2 - Switch. Сделайте ваш выбор (1/2):");
        int method = in.nextInt();

        if (method == 1) {  // работаем через nested-if
            if (number == 0) {
                System.out.println("Sunday");
            }
            if (number == 1) {
                System.out.println("Monday");
            }
            if (number == 2) {
                System.out.println("Tuesday");
            }
            if (number == 3) {
                System.out.println("Wednesday");
            }
            if (number == 4) {
                System.out.println("Thursday");
            }
            if (number == 5) {
                System.out.println("Friday");
            }
            if (number == 6) {
                System.out.println("Saturday");
            }
            if (number < 0 || number > 6) {
                System.out.println("Not a valid day");
            }

        } else { // работаем через switch
            switch (number) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Not a valid day");
            }
        }
    }
}

/* 5. Write a program that will ask the user for two int values and determine which one has the greatest value (i.e., higher on the
number line). The program should output something like, "The number x has the greatest value", where x is one of the numbers.*/
class GreatestValue {
    public static void main(String[] args) {
        System.out.println("Введите поочередно 2 числа:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if (x > y){
            System.out.println("Первое введенное вами число (" + x + ") больше второго числа (" + y + ")");
        } else if (x == y) {
            System.out.println("Введенные вами числа: " + x + " и " + y + " равны");
        } else {
            System.out.println("Первое введенное вами число (" + x + ") меньше второго числа (" + y + ")");
        }
    }
}

/* 6. Write a program that will ask the user for two int values and determine if the first divides evenly into the second,
displaying a message depending on the result. For example, the number 2 divides evenly into 4, but 4 does not divide
into 2 (so order matters). Hint: You may find the modulo operator (%) useful here.*/
class moduloCalc {
    public static void main(String[] args) {
        System.out.println("Введите поочередно 2 числа:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if (x % y == 0){
            System.out.println("Первое введенное вами число (" + x + ") делится без остатка на второе число (" + y + ")");
        } else {
            System.out.println("Первое введенное вами число (" + x + ") не может быть разделено без остатка на второе число (" + y + ")");
        }
    }
}

/* 7. Write a program that solves an equation of the form a x + b = 0 . The program should prompt the user for values
of a and b, then solve the equation for x and print the results. The program should take appropriate action if a is zero.*/
class equationCalc {
    public static void main(String[] args) {
        System.out.println("Для решения уравнения 'ax + b = 0' Введите поочередно значения a и b:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();

        if (a == 0){
            System.out.println("При a = 0 уравнение не имеет решений");
        } else {
            double x = (-b / a);
            System.out.println("x = " + x);
        }
    }
}

/* 8. Write a program that will ask the user for two float values and compare their magnitudes. For example, if the user
entered 3 and -9, the program should respond that -9 has the greater magnitude.*/
class magnitudesCalc {
    public static void main(String[] args) {
        System.out.println("Введите поочередно 2 числа:");
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat();
        float y = input.nextFloat();

        if (abs(x) > abs (y)){
            System.out.println("Первое введенное вами число (" + x + ") имеет большую магнитуду чем второе число (" + y + ")");
        } else if (abs(x) < abs (y)) {
            System.out.println("Второе введенное вами число (" + y + ") имеет большую магнитуду чем первое число (" + x + ")");
        } else {
            System.out.println("Магнитуда обоих чисел равна");
        }
    }
}

/* 9. Determine if the the int variable n is a perfect square and then display an appropriate message.*/
class perfectSquare {
    public static void main(String[] args) {
        System.out.println("Введите число которое нужно проверить на предмет идеального квадрата:");
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        int z = (int) sqrt(n);

        if (sqrt(n) == z){
            System.out.println("Введенное вами число (" + n + ") является идеальным квадратом для " + z);
        } else {
            System.out.println("Введенное вами число (" + n + ") не является идеальным квадратом");
        }
    }
}

/* 10. A quadratic equation in the form a x2+b x+c = 0 has roots (or zeroes) given by formula
x = (-b±sqrt(pow(b,2)-4 * a * c)) / (2* a)
Write a program that determines the values of the roots, root1 and root2, of the quadratic equation after asking the user to input values for a, b, and c. The program should take show appropriate messages if:
(a) the value of a is zero (in which case, see Exercise #4), and
(b) there are two, one, or zero real roots (you cannot take the square root of a negative
number).*/
class quadraticEquation {
    public static void main(String[] args) {
        System.out.println("Для решения уравнения 'ax^2 + bx + c = 0' Введите поочередно значения a, b, c:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double des, x;

        des = pow(b, 2) - 4 * a *c;

        if (des < 0 ) {
            System.out.println("Так как дискриминант меньше нуля, то уравнение не имеет действительных решений");
        } else if (des == 0){
            System.out.println("X1=X2 = " + (-b / (2* a)));
        } else {
            System.out.println("X1 = " + (-b + sqrt(pow(b,2) - 4 * a * c)) / (2* a));
            System.out.println("X2 = " + (-b - sqrt(pow(b,2) - 4 * a * c)) / (2* a));
        }
    }
}
