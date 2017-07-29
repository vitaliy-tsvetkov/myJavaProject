package Lesson09Hometask000.FractionNumber;

/**
 * Created by Vitaliy Tsvetkov on 22.07.2017.
 */

/* Write class to represent FractionNumbers
This class should contain two fields.
This class should contain methods to perform basic math operations:
plus, minus, multiply, derive
Also, this class should have toString method to print numbers into standard output
Create additional class like App to check functionality of FractionNumber class
*/
public class FractionNumbers {

    //поля класса
    private int numerator;
    private int denominator;

    //пишем конструктор который принимает поля. generate->constructor
    public FractionNumbers(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //plus
    //нам нужно возвращать новый  FractionNumbers, т.е. новое дробное число c названием plus и в него принимаем FractionNumbers
    //1/2 ± 6/7 = (1*7 ± 6*2)/(2+7) = (7+12)/14 = 19/14
    public FractionNumbers plus(FractionNumbers number) {
        //Инициализируем числитель (переменную num). Числитель результата равен сумме перемножений (1*7 ± 6*2)
        //т.е. берем числитель текущего дробного числа который мы будем прибавлять, умножаем его на знаменатель
        // второго числа плюс числитель второго числа умножаем на знаменатель первого числа.
        int num = this.numerator * number.denominator + number.numerator * this.denominator;

        //Инициализируем знаменатель (переменную denom). Знаменатель равен сумме знаменателей (2+7)
        //знаменатель мы перемножаем текущего на второй знаменатель.
        int denom = this.denominator * number.denominator;

        //Возвращаем новый инстанс FractionNumber
        return new FractionNumbers(num, denom);
    }

    //minus
    public FractionNumbers minus(FractionNumbers number) {
        int num = this.numerator * number.denominator - number.numerator * this.denominator;
        int denom = this.denominator * number.denominator;

        return new FractionNumbers(num, denom);
    }

    //multiply
    //1/2 * 6/7 = 1*6 / 2*7 = 6/14
    public FractionNumbers multiply(FractionNumbers number) {
        int num = this.numerator * number.numerator;
        int denom = this.denominator * number.denominator;

        return new FractionNumbers(num, denom);
    }

    // divide
    // 1/2 / 6/7 = 1*7 / 2*6 = 7/12
    public FractionNumbers divide(FractionNumbers number) {
        int num = this.numerator * number.denominator;
        int denom = this.denominator * number.numerator;

        return new FractionNumbers(num, denom);
    }

    public FractionNumbers compare(FractionNumbers number) {
        int num = this.numerator * number.denominator;
        int denom = this.denominator * number.numerator;

        return new FractionNumbers(num, denom);
    }

    //создадим вывод в строку через generate->toString()
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
