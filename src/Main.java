import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        for (int b = 10; b > 0; b = b - 1) {
            System.out.println(b);
        }

        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
        for (int c = 0; c < 17; c = c + 2) {
            System.out.println(c);
        }

        System.out.println();
        System.out.println("Задание 4");
        System.out.println();
        for (int d = 10; d > -10; d = d - 1) {
            System.out.println(d);
        }

        System.out.println();
        System.out.println("Задание 5");
        System.out.println();
        for (int leapYear = 1904; leapYear < 2097; leapYear = leapYear + 4) {
            System.out.println(leapYear + " год является високосным.");
        }

        System.out.println();
        System.out.println("Задание 6");
        System.out.println();
        for (int number = 7; number < 99; number = number + 7) {
            System.out.println(number);
        }

        System.out.println();
        System.out.println("Задание 7");
        System.out.println();
        for (int number1 = 1; number1 < 513; number1 = number1 * 2) {
            System.out.println(number1);
        }

        System.out.println();
        System.out.println("Задание 8");
        System.out.println();
        int contribution = 0;
        for (int month = 1; month <= 12; month++) {
            contribution = contribution + 29000;
            System.out.println("За " + month + " месяц, сумма накоплений равна " + contribution + " рублей.");
        }

        System.out.println();
        System.out.println("Задание 9");
        System.out.println();
        contribution = 0;
        double percent = 0;
        for (int month = 1; month <= 12; month++) {
            contribution = contribution + 29000;
            percent = contribution * 0.01;
            System.out.println("За " + month + " месяц, сумма накоплений равна " + (contribution + percent) + " рублей.");
        }

        System.out.println();
        System.out.println("Задача 10");
        System.out.println();
        int number = 2;
        for (int multiplier = 1; multiplier <=10; multiplier++){
            int sum = number * multiplier;
            System.out.println(number + " * " + multiplier + " = " + sum);
        }
    }
}