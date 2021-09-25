package ru.khrebtov.lesson5;

import ru.khrebtov.lesson5.Backpack.Item;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
//        System.out.println(fact(5));
//        System.out.println(recFact(5));

//        System.out.println(fibo(100));
//        System.out.println(recFibo(10));

//        System.out.println(triangleNum(5));
//        System.out.println(recTriangleNum(5));

//        System.out.println(multiply(3, 8));
//        System.out.println(recMultiply(3, 8));

//        reversPrint("qwerty".toCharArray());
//        for (int i = 0; i < 100; i++) {
//            System.out.println(exponentiation(2L, i));
//        }
        int j =5;
        Item[] items = new Item[j];
        for (int i = 0; i < j; i++) {
            items[i] = new Item((int) (Math.random()*100), (int) (Math.random()*100) );
            System.out.println(items[i]);
        }
        Backpack bag = new Backpack(200,items );
        System.out.println(bag.getBag());
    }

    public static void reversPrint(char[] arr) {
        reversPrint(arr, arr.length - 1);
    }

    private static void reversPrint(char[] arr, int n) {
        if (n < 0) {
            return;
        }
        System.out.print(arr[n]);
        reversPrint(arr, n - 1);
    }

    public static int recMultiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return recMultiply(a, b - 1) + a;
    }

    public static int multiply(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }

    public static int recTriangleNum(int n) {
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    public static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long recFibo(int n) {
        System.out.print(n + " ");
        if (n < 3) {
            return 1;
        }
        return recFibo(n - 1) + recFibo(n - 2);
    }

    public static long fibo(int n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int recFact(int n) {
        if (n == 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }

    public static BigDecimal exponentiation(Long number, int degree) {
        if (degree < 0) {
            throw new RuntimeException("Degree can't be less 1");
        }
        if (degree == 0) {
            return new BigDecimal(1);
        }
        if (degree == 1) {
            return new BigDecimal(number);
        }

        return exponentiation(number, degree - 1).multiply(new BigDecimal(number));
    }
}
