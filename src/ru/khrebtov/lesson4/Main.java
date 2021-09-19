package ru.khrebtov.lesson4;

public class Main {
    public static void main(String[] args) {
//        MyLinkedList<Integer> mll = new MyLinkedList<>();
//
//        mll.insertFirst(5);
//        mll.insertFirst(15);
//        mll.insertFirst(25);
//        mll.insertFirst(35);

//        System.out.println(mll.removeFirst());
//
//        System.out.println(mll);
//
//        mll.insertLast(2);
//        mll.insertLast(22);
//
//        System.out.println(mll);
//
//        mll.insert(2, 777);
//        System.out.println(mll);
//        System.out.println(mll.removeFirst());
//        System.out.println(mll);
//        System.out.println(mll.removeLast());
//        System.out.println(mll);
//
//        mll.insert(2, 111);
//        mll.insert(2, 22);
//        System.out.println(mll);
//
//        System.out.println(mll.remove(22));
//        System.out.println(mll);
//
//        for (Integer x : mll) {
//            System.out.println(x);
//        }

        MyLinkedQueue<Integer> mLQ = new MyLinkedQueue();
        mLQ.offer(5);
        mLQ.offer(7);
        mLQ.offer(8);
        mLQ.offer(null);
        System.out.println(mLQ);
        System.out.println(mLQ.remove());
        System.out.println(mLQ);
        System.out.println(mLQ.indexOf(null));
    }
}
