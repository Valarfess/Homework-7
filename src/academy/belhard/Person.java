package academy.belhard;

final class Person {
    private String firstName;
    private String lastName;
    private Gender gender;

    public Person (String firstName, String lastName, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return firstName == person.firstName &&
                lastName == person.lastName &&
                gender == person.gender;
    }
//    int f = Integer.parseInt(firstName);
//    int l = Integer.parseInt(lastName);
//    int g = Integer.parseInt(String.valueOf(gender));
//
//    @Override
//    public int hashCode() {
//        return f + l + g;
//    }

    @Override
    public String toString() {
        return "Person: " +
                "firstName - " + firstName +
                ", lastName - " + lastName +
                ", gender - " + gender +
                '.';
    }

}