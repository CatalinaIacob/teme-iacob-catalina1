package java_week4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main (String[] args) {
        Set<String> orase = new TreeSet<>();
        //citit despre streams Java8
        orase.stream().findFirst();
        orase.add("Iasi");
        orase.add("Cluj");
        orase.add("Vaslui");
        orase.add("Bacau");

        System.out.println(orase);

        //add duplicate
        orase.add("Bacau"); //face rename la cel existent deja in set.
        System.out.println(orase);

        orase.remove("Bacau");
//        orase.clear();
        orase.size();

        //for each on set / list ( variabila care stocheaza fiecare oras din lista : numele listei)
        for (String orasName: orase) {
            if (orasName.contains("Vaslui"))
            System.out.println("Orasele din for sunt:  "  + orasName);

        }
    }
}
