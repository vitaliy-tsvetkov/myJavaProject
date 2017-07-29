package Lesson05Hometask;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

/**
 * Created by Vitaliy Tsvetkov on 11.07.2017.
 */
public class Converters {
    public static void main(String[] args) {
        double temperature = -9;
        double distance = 15;
        double weight = 15;

        int num = 54;
        String binary = "110110";
        int numForHex = 654646;
        String hex = "4F5";


        double xa0 = 15, xb0 = 2.5, xc0 = -9;
        double xa1 = 1, xb1 = 0, xc1 = 9;
        double xa2 = 1, xb2 = 2, xc2 = 1;

        System.out.println(temperature + "'C = " + celsToKelv(temperature) + "'K");
        System.out.println(temperature + "'К = " + kelvToCels(temperature) + "'C");
        System.out.println(temperature + "'C = " + celsToFar(temperature) + "'F");
        System.out.println(temperature + "'F = " + farToCels(temperature) + "'C");
        System.out.println();

        System.out.println(distance + " m = " + mToInc(distance) + " inc");
        System.out.println(distance + " inc = " + incToM(distance) + " m");
        System.out.println(distance + " mil = " + milToKm(distance) + " km");
        System.out.println(distance + " km = " + kmToMil(distance) + " mil");
        System.out.println();

        System.out.println(weight + "lb = " + lbToKil(weight) + "kg");
        System.out.println(weight + "kg = " + kilToLb(weight) + "lb");
        System.out.println();

        System.out.println(num + "(DEC) =  " + decToBin(num) + "(BIN)");
        System.out.println(binary + "(BIN) =  " + binToDec(binary) + "(DEC)");
        System.out.println(numForHex + "(DEC) =  " + decToHex(numForHex) + "(HEX)");
        System.out.println(hex + "(HEX) =  " + hexToDec(hex) + "(DEC)");
        System.out.println();

        System.out.println(quadrEquation(xa0, xb0, xc0));
        System.out.println(quadrEquation(xa1, xb1, xc1));
        System.out.println(quadrEquation(xa2, xb2, xc2));
        System.out.println();
    }

    public static double celsToKelv (double cels) {
        return cels + 273.15;
    }

    public static double kelvToCels (double kelv) {
        return kelv - 273.15;
    }

    public static double celsToFar (double cels) {
        return cels * 1.8 + 32;
    }

    public static double farToCels (double far) {
        return (far - 32) / 1.8;
    }

    public static double mToInc (double m) {
        return m * 39.37;
    }

    public static double incToM (double inc) {
        return inc / 39.37;
    }

    public static double milToKm (double mil) {
        return mil / 1.852;
    }

    public static double kmToMil (double km) {
        return km * 1.852;
    }

    public static double lbToKil (double lb) {
        return lb / 2.2046;
    }

    public static double kilToLb (double kil) {
        return kil * 2.2046;
    }

    public static String decToBin (int dec) {
        int a;
        int b;
        int length = 0;
        int tempLong[] = new int[256];
        String result = "";

        while (dec > 0) {
            a = dec % 2;
            b = dec / 2;

            dec = b;
            tempLong[length] = a;
            length += 1;
        }

        int temp[] = new int[length];
        System.arraycopy(tempLong, 0, temp, 0, length);

        int i = 0, k = length;
        while (i < length) {
            result += temp[k - 1];
            i++;
            k--;
        }

        return result;
    }

    public static double binToDec (String bin) {
        int length = bin.length();
        int a;
        String str = bin;
        char temp[] = str.toCharArray();

        int basic[] = new int[length];

        int l = 0;
        int dec = 0;
        int basicLength = length;

        while (basicLength > 0) {
            basic[l] = (int) Math.pow(2,basicLength-1);
            basicLength--;
            l++;
        }

        int i = 0;
        while (i < length) {
            if (temp[i] == 48)  a = 0; //защита от ввода халабалы. ноль = 0, все остальные символы = 1
            else a = 1;

            dec = dec + a * basic[i];
            i++;
        }

        return dec;
    }

    public static String decToHex (int dec) {
        int source = dec;
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

        return hex;
    }

    public static double hexToDec (String hex) {
        int length = hex.length();
        String str = hex;
        char temp[] = str.toCharArray();
        int basic[] = new int[length];
        int a;
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
            a = hexTemp * basic[l];
            dec += a;
            l++;
            length--;
        }
        return dec;
    }

    public static String quadrEquation (double a, double b, double c) {

        double des = pow(b, 2) - 4 * a *c;
        String equation = "Уравнение: (" + a + ")*x² + (" + b + ")*x + (" + c + ") = 0, ";

        if (des < 0 ) {
            String err = equation.concat("не имеет корней");
            return err;
        } else if (des == 0){
            equation = "Уравнение: (" + a + ")*x² + (" + b + ")*x + (" + c + ") = 0, имеет один корень X = ";
            String oneRes = equation.concat(String.valueOf((-b / (2* a))));
            return oneRes;
        } else {
            equation = "Уравнение: (" + a + ")*x² + (" + b + ")*x + (" + c + ") = 0, имеет два корня ";
            String x1 = String.valueOf((-b + sqrt(pow(b,2) - 4 * a * c)) / (2* a));
            String x2 = String.valueOf((-b - sqrt(pow(b,2) - 4 * a * c)) / (2* a));
            String twoRes = equation + "x1 = " + x1.concat(", x2 = " + x2);
            return twoRes;
        }

    }
}