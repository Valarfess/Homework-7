package academy.belhard;

import java.util.Map;
import java.util.HashSet;
import java.util.Set;


final class MyHashMap {

    public static void main(String[] args) {

        Person pers1 = new Person("Nikita","Pupkin",Gender.MALE);
        Person pers2 = new Person("Stas","Mihailov",Gender.FEMALE);
        Person pers3 = new Person("Gena","Razdolbaev",Gender.MALE);
        Person pers4 = new Person("Turbo","Fromcamedy",Gender.FEMALE);
        Person pers5 = new Person("Dusha","Metelkin",Gender.MALE);

        java.util.HashMap<Person, Integer> Persons = new java.util.HashMap<>();

        Persons.put(pers1, 1);
        Persons.put(pers2, 2);
        Persons.put(pers3, 3);
        Persons.put(pers4, 4);
        Persons.put(pers5, 5);

        outputCollection(Persons);
    }

    public static void outputCollection(Map<Person, Integer> map) {
        System.out.println("Вывод: ");

//        for (Map.Entry<Person, Integer> keyValuePair : map.entrySet()) {
//            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
//        }
//
//        System.out.println();
    }
}
