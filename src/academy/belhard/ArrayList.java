package academy.belhard;
import java.util.ArrayList;
import java.util.List;


public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> personClub = new ArrayList<>();
        personClub.add(1);
        personClub.add(2);
        personClub.add(3);
        personClub.add(4);
        personClub.add(5);

        outputCollection(personClub);


        personClub.remove(3);

        outputCollection(personClub);
    }

    public static void outputCollection(List<Integer> list) {
        System.out.println();

        for (Integer number : list) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}