package ru.khrebtov.lesson4;

import java.util.NoSuchElementException;

public class MyLinkedQueue<T> {

    private MyLinkedList<T> list;

    public MyLinkedQueue() {
        list = new MyLinkedList<>();
    }

    public void offer(T t) {
        list.insertLast(t);
    }

    public T remove() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("LinkedQueue is empty");
        }

        return list.removeFirst();
    }

    public T poll() {
        if (list.isEmpty()) {
            return null;
        }

        return list.removeFirst();
    }

    public T element() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("LinkedQueue is empty");
        }

        return list.getFirst();
    }

    public T peek() {
        if (list.isEmpty()) {
            return null;
        }

        return list.getFirst();
    }

    public int indexOf(T element){
        return list.indexOf(element);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "MyLinkedQueue{" +
                "list=" + list +
                '}';
    }
}
