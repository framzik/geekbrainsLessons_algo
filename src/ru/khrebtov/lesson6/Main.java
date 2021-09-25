package ru.khrebtov.lesson6;

import java.util.Random;

public class Main {

    public static int getRandomBetween(int min, int max) {
        final Random random = new Random();
        int diff = max - min;
        int i = random.nextInt(diff + 1);
        return i += min;
    }

    public static void main(String[] args) {
        int balanced = 0;
        int countMaps = 1000;
        for (int i = 0; i < countMaps; i++) {
            MyTreeMap<Integer, String> map = new MyTreeMap<>();
            while (map.height() != 6) {
                int randomInt = getRandomBetween(-100, 100);
                map.put(randomInt, String.valueOf(randomInt));
            }
            if (map.isBalanced()) {
                balanced++;
            }
        }
        System.out.println("Balanced maps: " + (balanced * 100) / countMaps + "%");

//        map.put(5, "five");
//        map.put(4, "four");
////        map.put(1, "one");
//        map.put(3, "three");
//        map.put(2, "two");

//        System.out.println(map.get(4));
//        map.put(4, "four four");
//
//        System.out.println(map.get(4));
//        System.out.println(map.size());
//
//        System.out.println(map);
//
//        map.remove(1);
//        System.out.println(map);

//        System.out.println(map.isBalanced());

    }
}
