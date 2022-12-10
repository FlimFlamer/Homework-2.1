import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
        public static void task2() {
            System.out.println("Задание 2");
            for (int b = 10; b > 0; b = b - 1) {
                System.out.println(b);
            }
        }

    public static void task3 () {
        System.out.println("Задание 3");
        for (int c = 0; c < 17; c = c + 2) {
            System.out.println(c);
        }
    }

    public static void task4 () {
        System.out.println("Задание 4");
        for (int d = 10; d > -10; d = d - 1) {
            System.out.println(d);
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        for (int leapYear = 1904; leapYear < 2097; leapYear = leapYear + 4) {
            System.out.println(leapYear + " год является високосным.");
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        for (int number = 7; number < 99; number = number + 7) {
            System.out.println(number);
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        for (int number1 = 1; number1 < 513; number1 = number1 * 2) {
            System.out.println(number1);
        }
    }

    public static void task8() {
        System.out.println("Задание 8");
        int contribution = 0;
        for (int month = 1; month <= 12; month++) {
            contribution = contribution + 29000;
            System.out.println("За " + month + " месяц, сумма накоплений равна " + contribution + " рублей.");
        }
    }

    public static void task9() {
        System.out.println("Задание 9");
        int contribution = 0;
        double percent = 0;
        for (int month = 1; month <= 12; month++) {
            contribution = contribution + 29000;
            percent = contribution * 0.01;
            System.out.println("За " + month + " месяц, сумма накоплений равна " + (contribution + percent) + " рублей.");
        }
    }
    public static void task10(){
            System.out.println("Задача 10");
            int number = 2;
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                int sum = number * multiplier;
                System.out.println(number + " * " + multiplier + " = " + sum);
            }
        }
    }
