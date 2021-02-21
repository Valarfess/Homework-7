package academy.belhard;

import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class MyHashSet {

    public static void main(String[] args) {

        Person pers1 = new Person("Nikita","Pupkin",Gender.MALE);
        Person pers2 = new Person("Nikita","Pupkin",Gender.MALE);
        Person pers3 = new Person("Gena","Razdolbaev",Gender.MALE);
        Person pers4 = new Person("Gena","Razdolbaev",Gender.MALE);
        Person pers5 = new Person("Dusha","Metelkin",Gender.MALE);

        HashSet<Person> personClub = new HashSet<Person>();

        personClub.add(pers1);
        personClub.add(pers2);
        personClub.add(pers3);
        personClub.add(pers4);
        personClub.add(pers5);

        outputCollection(personClub);

        System.out.println("Всего в списке " + personClub.size() + " элементов");
    }

    public static void outputCollection(HashSet<Person> set) {
        System.out.println();

        for (Person personClub : set) {
            System.out.println(personClub.toString());
        }

        System.out.println();
    }
}