package Lesson06Hometask000;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Vitaliy Tsvetkov on 15.07.2017.
 */

//1. Change given text into all upper case or lower case or change the first letter of each word
// (or sentence) to upper and the rest to lower, etc.
class UpperLowerCaseApp {
    public static void main(String[] args) {
        String source = "change given text into all upper caSE";
        System.out.println("Сорс строка: \t\t\t\t" + source);

        int length = source.length();

        System.out.println("Сорс строка в апперкейсе: \t" + source.toUpperCase());
        System.out.println("Сорс строка в ловеркейсе: \t" + source.toLowerCase());
        System.out.println("Длина строки: \t\t\t\t" + length + " символов");

        String arr[] = source.split(" ");

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < Array.getLength(arr); i++) {
            String str = arr[i];
            String subArr[] = str.split("");


            String replace = "";
            replace += str.charAt(0);
            replace = replace.toUpperCase();
            subArr[0] = replace;

            String temp = "";

            int substrLength = str.length();
                for (int j = 0; j < substrLength; j++) {
                    temp += subArr[j];
                }

            arr[i] = temp;

        }

        System.out.println(Arrays.toString(arr));
    }
}

//2. Count letters
//Count the single character frequencies
class SingleCharCount {
    public static void main(String[] args) {
        String str = "Count the single character frequencies";

        char arr[] = str.toCharArray();

        int length = Array.getLength(arr);
        int index = (int) (Math.random() * length);
        char targetSymb = arr[index];

        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == targetSymb) counter += 1;
        }
        System.out.println("Исходный текст: \"" + str + "\"");
        System.out.println("Символ для поиска совпадений в тексте: '" + targetSymb + "'");
        System.out.println("Символ '" + targetSymb + "' в исходном тексте встречается " + counter + " раз(а)");
    }
}

//3. Count the words in some text
class Count {
    public static void main(String[] args) {
        String str = "Change given text into all upper case or lower case or change the first letter of each word. Thanks!";
        String arr[] = str.split(" ");

        System.out.println("В исходной строке " + arr.length + " слов");
    }
}

//4. Count words of each length
//Count the number of words of each length in some text.
class CountByLength {
    public static void main(String[] args) {
        String str = "Count the number of words of each length in some text";
        String[] arr = str.split(" ");
        int arrLength = Array.getLength(arr);
        int[] length = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            length[i] = arr[i].length();
        }

        Arrays.sort(length);
        int min = length[0];
        int max = length[arrLength-1];
        int count = max - min + 1;

        int[] arrLengthUnique = new int[count];

        for (int i = 0; i < count; i++) {
            arrLengthUnique[i] = min;
            min++;
        }

        int counter = 0;

        System.out.println("\nВ исходном тексте всего " + arrLength + " слов, из них:");

        for(int j = 0; j < count; j++) {
            for (int i = 0; i < arrLength; i++) {
                if (arrLengthUnique[j] == length[i]) counter++;
            }
            System.out.println("\t- " + counter + " слов(а), с длиной в " + arrLengthUnique[j] + " букв(ы)");
            counter = 0;
        }
    }
}

//5. Letter removal
//Given a phrase and a letter (or series of letters) remove all occurrences of that letter(s) in the phrase.
class Removal {
    public static void main(String[] args) {
        String str = "London is the capital of Great Britain";

        System.out.println(str);
        System.out.println(str.replace("t", ""));
        System.out.println(str.replaceAll("Great", "blablabla"));
        System.out.println(str.replaceAll("(G|B)", "*"));
    }
}

//7. Square word patterns
//Given a word, print a square made from letter rotations of the word as in:
//help
//elph
//lphe
//phel
class SquareApp {
    public static void main(String[] args) {
        String str = "hello";
        int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j + i >= length) {
                    System.out.print(str.charAt(j + i - length));
                } else {
                    System.out.print(str.charAt(j + i));
                }
            }
            System.out.println();
        }
    }
}

//6. еще в процессе
// Product code validation eg: AX6BYU56UX6CV6BNT7NM 287430
//1st part can contain only capital letters and 6 digits. 2nd part is all digits and = the product of the
// first 6 digits taken in groups of two from the left. Eg 65*66*67 = 287430.
class Validation {
    public static void main(String[] args) {
        String str = "AX6BYU56UX6CV6BNT7NM 287430";

        String sourceArray[] = str.split(" ");
        String firstPartArray[] = str.split("");
        String secondPartArray[] = str.split("");

    }
}