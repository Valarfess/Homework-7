package academy.belhard;
import java.util.HashSet;
import java.util.Set;

class MyHashSet {
    public static void main(String[] args) {
        Person pers1 = new Person("Nikita","Pupkin",Gender.MALE);
        Person pers2 = new Person("Nikita","Pupkin",Gender.MALE);
        Person pers3 = new Person("Gena","Razdolbaev",Gender.MALE);
        Person pers4 = new Person("Gena","Razdolbaev",Gender.MALE);
        Person pers5 = new Person("Dusha","Metelkin",Gender.MALE);

        Set<Person> Persons = new java.util.HashSet<>();

        Persons.add(pers1);
        Persons.add(pers2);
        Persons.add(pers3);
        Persons.add(pers4);
        Persons.add(pers5);

        outputCollection(Persons);
    }

    public static void outputCollection(Set<Person> set) {
        System.out.println("На выход: ");

        for (Person number : set) {
            System.out.println(number + " ");
        }

        System.out.println();
    }
}