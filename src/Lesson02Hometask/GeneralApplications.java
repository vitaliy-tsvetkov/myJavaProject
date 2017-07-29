package Lesson02Hometask;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Vitaly Tsvetkov on 28.06.2017.
 */

//1.1 + 1.2 Конвертация времени
class GeneralApplicationsTime {
    public static void main(String[] args) {



//задание 1.1 convert time in seconds to days, hours, min and seconds or reverse
        System.out.println("\n1. КОНВЕРТАЦИЯ ВРЕМЕНИ:\n");
        Scanner in = new Scanner(System.in);
        System.out.print("\n1.1 Введите количество секунд для конвертации в формат dd HH:MM:SS: ");
        int sec = in.nextInt();

        int dd = 0, hh = 0, mm = 0, ss = 0, temp = 0;
        temp = sec % 86400;
        dd = sec / 86400;
        hh = temp / 3600;
        mm = temp % 3600 / 60;
        ss = temp % 3600 % 60;
        System.out.println("\t" + sec + " секунд это: " + dd + " d " + hh + "h:" + mm + "m:" + ss + "s");

        int year, month, day;
        System.out.print("\n1.2 Введите поочередно год, месяц, число своего рождения\n");
        year = in.nextInt();

//ввод месяца с проверкой валидности ввода (от 1 до 12)
        month = in.nextInt();
        do {
            if (month < 1 || month > 12) {
                System.out.println("Ошибочный ввод. Месяц не может быть вне диапазона от 1 до 12\n" +
                        "Повторите ввод месяца:");
                month = in.nextInt();
            }
        } while (month < 1 || month > 12);

//ввод дня с проверкой валидности ввода
        day = in.nextInt();
//для месяцев длиной в 31 день
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            do {
                if (day < 1 || day > 31 ) {
                    System.out.println("Ошибочный ввод. В выбранном Вами месяце " + month +
                            " дата может быть в диапазоне от 1 до 31\n" + "Повторите ввод даты:");
                    day = in.nextInt();
                }
            } while (day < 1 || day > 31);
        }
//для месяцев длиной в 30 дней
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            do {
                if (day < 1 || day > 30 ) {
                    System.out.println("Ошибочный ввод. В выбранном Вами месяце " + month +
                            " дата может быть в диапазоне от 1 до 30\n" + "Повторите ввод даты:");
                    day = in.nextInt();
                }
            } while (day < 1 || day > 30);
        }

//для февраля (28/29 дней)
        int ytype;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            ytype = 1;
        } else {
            ytype = 0;
        }
// 29 дней
        if (month == 2 && ytype == 1) {
            do {
                if (day < 1 || day > 29 ) {
                    System.out.println("Ошибочный ввод. В выбранном Вами месяце " + month +
                            " дата может быть в диапазоне от 1 до 29\n" + "Повторите ввод даты:");
                    day = in.nextInt();
                }
            } while (day < 1 || day > 29);
        } else {
            do {
                if (day < 1 || day > 28 ) {
                    System.out.println("Ошибочный ввод. В выбранном Вами месяце " + month +
                            " дата может быть в диапазоне от 1 до 28\n" + "Повторите ввод даты:");
                    day = in.nextInt();
                }
            } while (day < 1 || day > 28);
        }


//1.2 год рождения в дни/месяцы...
        long sectotal, birthsec, cursec;
        long y1 = 0, m1 = 0, w1 = 0, dd1 = 0, hh1 = 0, mm1 = 0, ss1 = 0;

        Calendar cold = new GregorianCalendar(year, month, day);
        birthsec = cold.getTimeInMillis() / 1000;
        cursec = System.currentTimeMillis() / 1000;

        sectotal = cursec - birthsec;

        int yconst = 365 * 86400 + 21600; // в году 365 дней и 6 часов
        int mconst = 30 * 86400; // в месяце 30,44 дня, но округлим до 30
        int wconst = 7 * 86400;
        y1 = sectotal / yconst;
        m1 = sectotal % yconst / mconst;
        w1 = sectotal % yconst % mconst / wconst;
        dd1 = sectotal % yconst % mconst % wconst / 86400;
        hh1 = sectotal % yconst % mconst % wconst % 86400 / 3600;
        mm1 = sectotal % yconst % mconst % wconst % 86400 % 3600 / 60;
        ss1 = sectotal % yconst % mconst % wconst % 86400 % 3600 % 60;
        System.out.println("\tВы прожили " + y1 + "y " + m1 + "m " + w1 + "w " + dd1 + "d " + hh1 + "h:" + mm1 + "m:" + ss1 + "s");
    }
}

//2.1 Расчет процента результата за прохожение теста
class GeneralApplicationsMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите максимальный балл за тест: ");
        double resultmax = in.nextDouble();
        System.out.println("Введите полученный Вами балл за тест: ");
        double result = in.nextDouble();
        do {
            if (result > resultmax || result <= 0) {
                System.out.println("Ошибочный ввод. Оценка за тест не может быть отрицательной или больше " + resultmax);
                result = in.nextDouble();
            } else {
                result = in.nextDouble();
            }
        } while (result > resultmax || result <= 0);
        System.out.println("Вы набрали " + result + " баллов, что составляет " + result / resultmax * 100 +
                "% от максимально возможного результата (" + resultmax + ")");
    }
}

//3.1 Множественный выбор - задачу еще не выполнял, до момента уточнения условия задачи
class GeneralApplicationMultiple {
    public static void main(String[] args) {

    }
}