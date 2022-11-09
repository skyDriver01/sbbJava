import objektOriented.aufg1.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("A", 1, 2, 3, 4, true));
        patients.add(new Patient("B", 1, 2, 33, 4, true));
        patients.add(new Patient("C", 1, 2, 13, 4, true));
        patients.add(new Patient("D", 1, 2, 43, 4, true));
        patients.add(new Patient("E", 1, 2, 53, 4, true));

        int[] zahlenArray = {1, 2, 5, 3, 4, 7};
        var liste = new ArrayList<Integer>();
        liste.add(3);
        liste.add(1);
        liste.add(5);
        liste.add(4);
        var streamL = liste.stream();

        var stream = Arrays.stream(zahlenArray);

        //stream.forEach(x->System.out.println(x));
        stream.filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

        System.out.println(
                patients.stream().map(x -> x.getWeight()).reduce((a, b) -> a + b).get()
        );

    }

    /*private float anonymFunction(x) {
      return x.getWeight();   So wie technisch gesehen eine Lambda aufgebaut ist
    } */
}
