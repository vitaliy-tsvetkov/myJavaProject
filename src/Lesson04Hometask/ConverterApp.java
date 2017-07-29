package Lesson04Hometask;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.StrictMath.sin;

/**
 * Created by Vitaliy Tsvetkov on 05.07.2017.
 */

//1. Write a program to convert decimal number into binary and back
class ConverterBinaryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите исходное число для перевода его в двоичную систему: ");

        int source = sc.nextInt();
        int a;
        int b;
        int length = 0;
        int tempLong[] = new int[256];

        System.out.print(source + " в двоичной системе это: ");

//Конвертация DEC -> BIN
        while (source > 0) {
            a = source % 2;
            b = source / 2;

            source = b;
            tempLong[length] = a;
            length += 1;
        }

        int temp[] = new int[length];
        System.arraycopy(tempLong, 0, temp, 0, length);

        int i = 0, k = length;
        while (i < length) {
            System.out.print(temp[k - 1]);
            i++;
            k--;
        }

        System.out.println();

//обратная конвертация BIN -> DEC

        int basic[] = new int[length];
        int backConvTemp[] = new int[length];

        int l = 0;
        int dec = 0;
        while (l < length) {
            basic[l] = (int) pow(2,l);
            backConvTemp[l] = temp[l] * basic[l];
            dec = dec + backConvTemp[l];
            l++;
        }

        System.out.println("При обратной конвертации в DEC получим: " + dec);
    }
}

//2. Write a program to convert decimal number into hex and back -
//10-A, 11-B, 12-C, 13-D, 14-E, 15-F
class ConverterHexApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите исходное число для перевода его в HEX систему: ");

        int source = sc.nextInt();
        int a;
        int b;
        int baseHex[] = {16, 256, 4096, 65536, 1048576, 16777216, 268435456}; //основание (16^1, ..., 16^n)
        int selectedBase = 0;
        int i = 0, j = 0;

        while (i < source) {
                if (source < baseHex[i]) {
                    selectedBase = baseHex[i-1];
                    break;
                } else i++;
        }

        String hex = "";

        while (j < i){
            selectedBase = baseHex[i-j-1];
            a = source / selectedBase;
            b = source - (a * selectedBase);
            source = b;

            switch (a){
                case 0: hex += 0;
                    break;
                case 1: hex += 1;
                    break;
                case 2: hex += 2;
                    break;
                case 3: hex += 3;
                    break;
                case 4: hex += 4;
                    break;
                case 5: hex += 5;
                    break;
                case 6: hex += 6;
                    break;
                case 7: hex += 7;
                    break;
                case 8: hex += 8;
                    break;
                case 9: hex += 9;
                    break;
                case 10: hex += 'A';
                    break;
                case 11: hex += 'B';
                    break;
                case 12: hex += 'C';
                    break;
                case 13: hex += 'D';
                    break;
                case 14: hex += 'E';
                    break;
                default: hex += 'F';
            }

            j++;
            if (j == i) {
                switch (b){
                    case 0: hex += 0;
                        break;
                    case 1: hex += 1;
                        break;
                    case 2: hex += 2;
                        break;
                    case 3: hex += 3;
                        break;
                    case 4: hex += 4;
                        break;
                    case 5: hex += 5;
                        break;
                    case 6: hex += 6;
                        break;
                    case 7: hex += 7;
                        break;
                    case 8: hex += 8;
                        break;
                    case 9: hex += 9;
                        break;
                    case 10: hex += 'A';
                        break;
                    case 11: hex += 'B';
                        break;
                    case 12: hex += 'C';
                        break;
                    case 13: hex += 'D';
                        break;
                    case 14: hex += 'E';
                        break;
                    case 15: hex += 'F';
                        break;
                    default: hex += ' ';
                }
            }
        }
        System.out.println(hex);

//back conversion (HEX to DEC)
        int length = hex.length();
        String str = hex;
        char temp[] = str.toCharArray();
        int basic[] = new int[length];
        int c;
        int l = 0;
        int dec = 0;
        int basicLength = length;

        while (basicLength > 0) {
            basic[l] = (int) Math.pow(16,basicLength-1);
            basicLength--;
            l++;
        }

        int hexTemp;
        l = 0;

        while (length > 0) {
            switch (temp[l]){
                case '0': hexTemp = 0;
                    break;
                case '1': hexTemp = 1;
                    break;
                case '2': hexTemp = 2;
                    break;
                case '3': hexTemp = 3;
                    break;
                case '4': hexTemp = 4;
                    break;
                case '5': hexTemp = 5;
                    break;
                case '6': hexTemp = 6;
                    break;
                case '7': hexTemp = 7;
                    break;
                case '8': hexTemp = 8;
                    break;
                case '9': hexTemp = 9;
                    break;
                case 'A': hexTemp = 10;
                    break;
                case 'B': hexTemp = 11;
                    break;
                case 'C': hexTemp = 12;
                    break;
                case 'D': hexTemp = 13;
                    break;
                case 'E': hexTemp = 14;
                    break;
                default: hexTemp = 15;
            }
            c = hexTemp * basic[l];
            dec += c;
            l++;
            length--;
        }
        System.out.println(dec);

    }
}

//3. Write a program which finds minimal number from int array
class MinFromArray {
    public static void main(String[] args) {
        int array[] = new int[10];
        int array2[] = new int[10];
        int a;

        for (int i = 0; i < 10; i++) {
            a = (int) (Math.random() * 100);
            array[i] = a;
        }
        System.out.println("Массив: " + Arrays.toString(array));

        System.arraycopy(array, 0 ,array2, 0, 10);
        Arrays.sort(array2); //Копируем массив в новый массив для последующей обработки и сохранения исходного массива без изменений

        System.out.println("Минимальное значение в массиве: " + array2[0]);
    }
}

//4. Write a program which prints a table of all results for sin(x), where x equals every 10 degrees from 0 to 360
class TableOfSinX {
    public static void main(String[] args) {
        int a = 0;
        double b;

        while (a <= 360) {
            b = sin(a * PI / 180);
            System.out.println("Sin(" + a + "') равен " + b);
            a += 10;
        }
    }
}

//5. Sort an array from min to max
class ArraySorting {
    public static void main(String[] args) {
        int array[] = new int[10];
        int a;

        for (int i = 0; i < 10; i++) {
            a = (int) (Math.random() * 100);
            array[i] = a;
        }
        System.out.println("Массив без сортировки: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Массив отсортирован по возрастанию: " + Arrays.toString(array));
    }
}

//6. Write a program which checks if string (use array of chars) is a palindrome
class PalindromeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Определяемся с длиной массива + валидация ввода
        System.out.println("Введите длину массива: ");
        double length = sc.nextDouble();
        if (length < 0) {
            while (length < 0) {
                System.out.println("Массив не может быть отрицательным числом. Введите целое число больше нуля: ");
                length = (int) sc.nextDouble();
            }
        }

        int symb;

        int massive[] = new int[(int) length];

//Заполняем массив
        System.out.println("Введите поочередно значения массива (цифры): ");

        for (int i = 0; i < (int) length; i++) {
            symb = sc.nextInt();
            massive[i] = symb;
        }
        System.out.println(Arrays.toString(massive));

//Проверка на палиндромность
        boolean result = true;

        int j = (int) length / 2;
            for (int i = 0; i <= j; i++) {
                if (massive[i] != massive[(int) length - 1 - i]) {
                    result = false;
                    break;
                }
            }
        if (result) {
            System.out.println("Введенный массив является палиндромом");
        } else {
            System.out.println("Введенный массив не является палиндромом");
        }
    }
}


//7. Write a program which prints reverse string (use array of char[] instead of String)
class ReverseString {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        double length = sc.nextDouble();
        if (length < 0) {
            while (length < 0) {
                System.out.println("Массив не может быть отрицательным числом. Введите целое число больше нуля: ");
                length = sc.nextDouble();
            }
        }

        length = (int) length;

        int i;
        int newPosition;
        int temp;
        int arr[] = new int[(int) length];
        int arrReverse[] = new int[(int) length];

        for (i = 0; i <= length - 1; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        for (i = 0; i <= (int) length - 1; i++) {
            newPosition = (int) length - i - 1;
            temp = arr[i];
            arrReverse[newPosition] = temp;
        }
        System.out.println("\nSource array:\t" + Arrays.toString(arr));
        System.out.println("Reverse array:\t" + Arrays.toString(arrReverse));
        }
    }

//8. Write a program which calculates the sum of two columns. the output should be. Print table if columns have the same size.
// Otherwise print which column has bigger size
//| row_1 | row_2 | sum |
//| 2 | 5 | 7 |
class SumOfColumns {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите желаемое количество строк таблицы:");
        int rows = in.nextInt();

        int v1, v2, sum, total, grandTotal = 0;
        System.out.println("-------------------------------------");
        System.out.println("|\tVal 1\t|\tVal 2\t|\tSum\t\t|");
        System.out.println("-------------------------------------");

        for (int i = 0; i <= rows; i++) {
            v1 = (int) (Math.random() * 100);
            v2 = (int) (Math.random() * 100);
            total = v1 + v2;

            System.out.println("|\t" + v1 + "\t\t|\t" + v2 +"\t\t|\t" + total + "\t\t|");
            grandTotal += total;
        }
        System.out.println("-------------------------------------");
        System.out.println(" TOTAL: \t\t\t\t\t" + grandTotal);
        System.out.println("-------------------------------------");
    }
}

//9. Write a program which will print all Fibonacci numbers till specified number
class FibonachiApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целевое число:");
        int target = scan.nextInt();

        int i = 2;
        int a = 0;
        int b = 1;
        int c = 1;
        int counter = 0;

        System.out.println("\n" + a);
        System.out.println(b);
        System.out.println(c);

        while (i <= target) {

            int d = b + c;
            b = c;
            c = d;
            i = d;
            counter += 1;

            if (d > target)
                break;

            System.out.println(d + " ");
        }
    }
}

//10.Write a program which prints all chars for range of ints 0...127
class CharFromRange {
    public static void main(String[] args) {
        int end = 127;

        int arr[] = new int[end + 1];

        for (int i = 0; i <= end; i++) {
            arr[i] = i;
        }
        System.out.println("\nChars 0...127 in array:\n" + Arrays.toString(arr) + "\n");

        System.out.println("List of chars 0...127:");
        for (int i = 0; i <= end; i++) {
            System.out.println(i);
        }
    }
}