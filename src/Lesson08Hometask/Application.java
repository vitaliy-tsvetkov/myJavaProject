package Lesson08Hometask;

/**
 * Created by Vitaliy Tsvetkov on 22.07.2017.
 */
public class Application {
    public static void main(String[] args) {
        FractionNumbers num1 = new FractionNumbers(3, 4);
        FractionNumbers num2 = new FractionNumbers(8, 11);

        FractionNumbers sumNumber = num1.plus(num2);
        FractionNumbers minusNumber = num1.minus(num2);
        FractionNumbers multiplyNumber = num1.multiply(num2);
        FractionNumbers divideNumber = num1.divide(num2);

        System.out.println("Первая дробь: " + num1);
        System.out.println("Вторая дробь: " + num2);
        System.out.println("\nСумма дробей: \t\t" + num1 + " + " + num2 + " = " + sumNumber);
        System.out.println("Разность дробей: \t" + num1 + " - " + num2 + " = " + minusNumber);
        System.out.println("Умножение дробей: \t" + num1 + " * " + num2 + " = " + multiplyNumber);
        System.out.println("Деление дробей: \t" + num1 + " / " + num2 + " = " + divideNumber);
    }
}