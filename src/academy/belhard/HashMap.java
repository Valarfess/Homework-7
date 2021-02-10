package academy.belhard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class HashMap {

    public static void main(String[] args) {
        Person pers1 = new Person("Nikita","Pupkin",Gender.MALE);
        Person pers2 = new Person("Stas","Mihailov",Gender.FEMALE);
        Person pers3 = new Person("Gena","Razdolbaev",Gender.MALE);
        Person pers4 = new Person("Turbo","Fromcamedy",Gender.FEMALE);
        Person pers5 = new Person("Dusha","Metelkin",Gender.MALE);

        // Create ArrayList
        Map<Box, Integer> Boxs = new HashMap<>();
        Boxs.put(p1, 1);
        Boxs.put(p2, 2);
        Boxs.put(p3, 3);
        Boxs.put(p4, 4);

        outputCollection(Boxs);

        // Remove element by key
        Boxs.remove(p1);

        outputCollection(Boxs);
    }

    public static void outputCollection(Map<Box, Integer> map) {
        System.out.println("Вывод: ");

        for (Map.Entry<Box, Integer> keyValuePair : map.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
        }

        System.out.println();
    }
}
