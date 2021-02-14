package academy.belhard;


import java.util.ArrayList;

final class MyArrayList {

    public static void main(String[] args) {

        Person pers1 = new Person("Nikita","Pupkin",Gender.MALE);
        Person pers2 = new Person("Stas","Mihailov",Gender.FEMALE);
        Person pers3 = new Person("Gena","Razdolbaev",Gender.MALE);
        Person pers4 = new Person("Turbo","Fromcamedy",Gender.FEMALE);
        Person pers5 = new Person("Dusha","Metelkin",Gender.MALE);

        java.util.ArrayList<Person> personClub = new java.util.ArrayList<Person>();

        personClub.add(pers1);
        personClub.add(pers2);
        personClub.add(pers3);
        personClub.add(pers4);
        personClub.add(pers5);

        outputCollection(personClub);

        System.out.println("Всего в списке " + personClub.size() + " элементов");
    }


    final static void outputCollection(java.util.ArrayList<Person> list) {
        System.out.println();

        for (Person personClub : list) {
            System.out.println(personClub.toString());
        }
        System.out.println();
    }
}