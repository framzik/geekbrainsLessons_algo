package ru.khrebtov.lesson2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }

//        System.out.println(Arrays.toString(arr));

//        int[] a = {1, 2, 3};
//        int[] b = {4, 5, 6};
//
//        b = a;
//        a[1] = 77;
//        b[2] = 99;
//
//        System.out.println(Arrays.toString(a));

//        String[] str = {"qwe", "asd", "zxc"};
//
//        for (int i = 0; i < str.length; i++) {
//            str[i]+="!!!";
//        }
//        System.out.println(Arrays.toString(str));

//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 43, 3, 2, 4, 2, 4, 2, -21, 1));
//        System.out.println(list);
//        list.addAll(2, Arrays.asList(77, 88, 99, 33, 44));
//        list.remove((Integer) 2);

//        list.removeAll(Arrays.asList(2, 4));
//        list.removeIf(x -> x == 2);
//        list.removeIf(x -> x > 2);
//        list.removeIf(x -> x >= 10 && x <= 100);
//        list.removeIf(x -> x % 2 != 0);

//        list.replaceAll(x -> x * 2);
//        list.replaceAll(x -> x % 2 != 0 ? x * 2 : x);

//        System.out.println(list);

//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(2);
//        mal.add(4);
//        mal.add(7);
//        System.out.println(mal);
//        mal.add(1, 77);
//        System.out.println(mal);

//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(6);
//        msal.add(16);
//        msal.add(3);
//        msal.add(7);
//        msal.add(5);
//
//        System.out.println(msal);
//        System.out.println(msal.binaryFind(7));

//        int n = 100_000;
//        Random random = new Random();
//        MyArrayList<Integer> mal = new MyArrayList<>(n);
//        for (int i = 0; i < n; i++) {
//            mal.add(random.nextInt());
//        }
//        mal.selectionSort();
//        mal.insertionSort();
//        mal.bubbleSort();

        selectionTime();
        insertionTime();
        bubbleTime();
        bubbleOptimizeTime();
    }

    private static void selectionTime() {
        MyArrayList<Integer> mal = initList();

        System.out.println("Start ");
        Long start = System.nanoTime();
        mal.selectionSort();
        long time = (System.nanoTime() - start) / 1_000_000_000;
        System.out.println("End");
        System.out.println("Time selectionSort: " + time + " sec");
    }

    private static void insertionTime() {
        MyArrayList<Integer> mal = initList();

        System.out.println("Start");
        Long start = System.nanoTime();
        mal.insertionSort();
        long time = (System.nanoTime() - start) / 1_000_000_000;
        System.out.println("End");
        System.out.println("Time insertionSort: " + time + " sec");
    }

    private static void bubbleTime() {
        MyArrayList<Integer> mal = initList();

        System.out.println("Start");
        Long start = System.nanoTime();
        mal.bubbleSort();
        long time = (System.nanoTime() - start) / 1_000_000_000;
        System.out.println("End");
        System.out.println("Time bubbleSort: " + time + " sec");
    }

    private static void bubbleOptimizeTime() {
        MyArrayList<Integer> mal = initList();

        System.out.println("Start");
        Long start = System.nanoTime();
        mal.bubbleSortOptimized();
        long time = (System.nanoTime() - start) / 1_000_000_000;
        System.out.println("End");
        System.out.println("Time bubbleSortOptimized: " + time + " sec");
    }

    private static MyArrayList<Integer> initList() {
        int count = 100_000;
        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(count);

        for (int i = 0; i < count; i++) {
            mal.add(random.nextInt());
        }
        return mal;
    }
}
