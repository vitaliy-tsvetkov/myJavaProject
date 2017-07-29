package Lesson02Hometask;
import java.util.Scanner;
import static java.lang.Math.round;

/**
 * Created by Vitaly Tsvetkov on 28.06.2017.
 */
class SimpleFormulasTemperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n1. ПЕРЕВОД ТЕМПЕРАТУРЫ ИЗ ГРАДУСОВ ЦЕЛЬСИЯ В ГРАДУСЫ ФАРЕНГЕЙТА\n");
        System.out.print("Введите температуру в градусах Цельсиях: ");
        double сel = in.nextDouble();
        double far = 0;
        far = round((сel * 9 / 5 + 32) * 100);
        far = far / 100;
        System.out.println("\t" + сel + " градусов Цельсия равны " + far + " градусам Фаренгейта\n");


        System.out.println("2. ПЕРЕВОД ТЕМПЕРАТУРЫ ИЗ ГРАДУСОВ ФАРЕНГЕЙТА В ГРАДУСЫ ЦЕЛЬСИЯ\n");
        System.out.print("Введите температуру в градусах Фаренгейта: ");
        double far1 = in.nextDouble();
        double сel1 = 0;
        сel1 = round((5 * (far1 - 32) / 9) * 100);
        сel1 = сel1 /100;
        System.out.println("\t" + far1 + " градусов Фаренгейта равны " + сel1 + " градусам Цельсия\n");


        System.out.println("3. ПЕРЕВОД ТЕМПЕРАТУРЫ ИЗ ГРАДУСОВ ЦЕЛЬСИЯ В ГРАДУСЫ КЕЛЬВИНА\n");
        System.out.print("Введите температуру в градусах Цельсиях: ");
        double сel2 = in.nextDouble();
        double kel = 0;
        kel = round((сel2 + 273.16) * 100) / 100;
        kel = kel / 100;
        System.out.println("\t" + сel2 + " градусов Цельсия равны " + kel + " градусам Кельвина\n");
    }
}

class SimpleFormulasDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean choice;

        System.out.println("\n4. КОНВЕРТАЦИЯ МЕТРОВ В ДЮЙМЫ И ОБРАТНО\n");
        System.out.print("Введите расстояние в метрах: ");
        double met = in.nextDouble();
        System.out.println("\t" + met + " м это " + met * 39.37 + " дюйм(а)\n");
        System.out.print("Выполнить обратную конвертацию (true/false)?");
        choice = in.nextBoolean();
        if (choice == true){
            System.out.print("Введите расстояние в дюймах: ");
            double inc = in.nextDouble();
            System.out.println("\t" + inc + " дюйм(а) это " + inc / 39.37 + " м\n");
        } else {
            System.out.print("\tПереходим к следующему этапу\n");
        }


        System.out.println("\n5. КОНВЕРТАЦИЯ МИЛЬ В КИЛОМЕТРЫ И ОБРАТНО\n");
        System.out.print("Введите расстояние в милях: ");
        double mil = in.nextDouble();
        System.out.println("\t" + mil + " миля(и/ь) это " + mil * 1.609 + " км\n");
        System.out.print("Выполнить обратную конвертацию (true/false)?");
        choice = in.nextBoolean();
        if (choice == true){
            System.out.print("Введите расстояние в километрах: ");
            double km = in.nextDouble();
            System.out.println("\t" + km + " км это " + km / 1.609 + " миля(и/ь)\n");
        } else {
            System.out.print("\tКонвертация величин завершена\n");
        }
    }
}

class SimpleFormulasWeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean choice;

        System.out.println("\n6. КОНВЕРТАЦИЯ КИЛОГРАММ В ФУНТЫ И ОБРАТНО\n");
        System.out.print("Введите вес в кг: ");
        double kg = in.nextDouble();
        System.out.println("\t" + kg + " кг это " + kg * 2.2046 + " фунт(ов)\n");
        System.out.print("Выполнить обратную конвертацию (true/false)?");
        choice = in.nextBoolean();
        if (choice == true){
            System.out.print("Введите вес в фунтах: ");
            double lb = in.nextDouble();
            System.out.println("\t" + lb + " фунт(ов) это " + lb / 2.2046 + " кг\n");
        } else {
            System.out.print("\tКонвертация величин завершена\n");
        }
    }
}

class SimpleFormulasSpeed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean choice;

        System.out.println("\n7. КОНВЕРТАЦИЯ СВОРОСТИ КМ/Ч В МИЛЬ/Ч И ОБРАТНО\n");
        System.out.print("Введите скорость в км/ч: ");
        double kmh = in.nextDouble();
        System.out.println("\t" + kmh + " км/ч это " + kmh * 0.6214 + " миль/ч\n");
        System.out.print("Выполнить обратную конвертацию (true/false)?");
        choice = in.nextBoolean();
        if (choice == true){
            System.out.print("Введите скорость в миль/ч: ");
            double mih = in.nextDouble();
            System.out.println("\t" + mih + " миль/ч это " + mih / 0.6214 + " км/ч\n");
        } else {
            System.out.print("\tКонвертация величин завершена\n");
        }
    }
}