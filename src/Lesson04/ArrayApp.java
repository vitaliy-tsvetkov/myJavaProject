package Lesson04;

import java.util.Arrays;

/**
 * Created by Vitaliy Tsvetkov on 05.07.2017.
 */
// работа с массивом
class ArrayApp {
    public static void main(String[] args) {

        int array[] = new int[10]; //такая форма инициализации пустого массива предпочтительней
        int[] array1 = new int[10]; //чем такая

        int numbers[] = {11,42,3,74,57}; //массив с четко заданными элементами

        for (int i = 0; i < 10; i++) {
            array[i] = i * 2;
        }
        System.out.println(array.length); //длина массива
        System.out.println(numbers.length);
        System.out.println(array[7]); //вывод определенного элемента

        array[3] = 56; // замена элемента

        System.out.println(Arrays.toString(array)); //вывод значений массива
    }
}

//работа с массивом. копирование массива в массив с последующей заменой элемента
class Array2App {
    public static void main(String[] args) {

        int array[] = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i * 2;
        }

        int arr2[] = array;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arr2));
        array[3] = 56;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arr2));

    }
}
