package Lesson04.Test;

/**
 * Created by Vitaliy Tsvetkov on 04.07.2017.
 */

/*Write command line program that accepts parameters and calculates the result. First parameter (args[0]) is a
key which operation to perform. Second parameter (args[1]) and third possible parameter (args[2]) is a number to
work with. Program should correctly process wrong number of parameters

Params:
-h  prints usage
-pow  Math.pow
-sqrt  Math.sqrt
-abs  Math.abs

"Usage:

-pow [number] [power]
-sqrt [number]
-abs [number]
"*/

public class Task1App {
    public static void main(String[] args) {
        String param = args [0];

        switch (param) {
            case "-h":
                System.out.println("Usage:\n");
                System.out.println("-pow \t[number] [power]");
                System.out.println("-sqrt \t[number]");
                System.out.println("-abs \t[number]");
                break;
            case "-pow":
                System.out.println(Math.pow(Double.parseDouble(args[1]), Double.parseDouble(args[2])));
                break;
            case "-sqrt":
                System.out.println(Math.sqrt(Double.parseDouble(args[1])));
                break;
            case "-abs":
                System.out.println(Math.abs(Double.parseDouble(args[1])));
                break;
            default:
                System.out.println("No such option");
        }
    }
}
