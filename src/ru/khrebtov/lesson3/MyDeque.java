package ru.khrebtov.lesson3;

public class MyDeque<T> {

    /**
     * 1   2   3   4   5   6 begin    end
     */

    private int[] list;
    private int size;
    private int begin;
    private int end;
    private int capacity;

    public MyDeque(int size) {
        this.size = size;
        list = new int[size];
        capacity = 0;
        begin = 0;
        end = -1;
    }

    public int getSize() {
        return size;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void insertLeft(int i) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        if (--begin < 0) {
            begin = size - 1;
        }
        list[begin] = i;
        capacity++;
    }

    public int removeLeft() {
        if (++begin > size - 1) {
            begin = 0;
        }
        capacity--;
        return list[begin - 1];
    }

    public void insertRight(int i) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        if (++end > size) {
            end = 0;
        }
        list[end - 1] = i;
        capacity++;
    }

    public int removeRight() {
        if (--end < 0) {
            end = size - 1;
        }
        capacity--;
        return list[end];
    }
}
