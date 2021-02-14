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

        java.util.HashMap<Integer,Person> personClub = new java.util.HashMap<Integer,Person>();

        personClub.put(1, pers1);
        personClub.put(2, pers2);
        personClub.put(3, pers3);
        personClub.put(4, pers4);
        personClub.put(5, pers5);

        outputCollection(personClub);

        System.out.println("Всего в списке " + personClub.size() + " элементов");

    }

    public static void outputCollection(java.util.HashMap<Integer,Person> map) {
        System.out.println("И вот что получилось: ");

        for (Map.Entry<Integer,Person> keyValuePair : map.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
        }

        System.out.println();
    }
}
