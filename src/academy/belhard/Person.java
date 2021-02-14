package academy.belhard;

final class Person {
    private final String firstName;
    private final String lastName;
    private final Gender gender;

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
        return firstName.equals(firstName) &&
                lastName.equals(lastName) &&
                gender.equals(gender);
    }


    @Override
    public int hashCode() {

        int result = firstName.hashCode() + lastName.hashCode() + gender.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return  "ComedyClub residents: " +
                "firstName - " + firstName +
                ", lastName - " + lastName +
                ", gender - " + gender +
                '.';
    }

}