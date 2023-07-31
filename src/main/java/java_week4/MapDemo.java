package java_week4;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> dex = new HashMap<>();

        dex.put("masa", "mobila dreapta");
        dex.put("somn", "adormit");

        System.out.println("Definitia pentru masa este: " + dex.get("masa"));
        System.out.println("Exista cuvantul cina in dictionar: " + dex.containsKey("cina")); //fals

        System.out.println(dex.size()); //2

        //return all the keys
        // creem un set (partea pana la =) urmat de metoda
        Set<String> keys= dex.keySet();

        //return all the values
        System.out.println(dex.values());
        System.out.println(dex.keySet());

        //return the all map

        System.out.println(dex.entrySet());

        // null in map ->null on values

        dex.put("automation", null);
        System.out.println(dex.entrySet());

        //null on key

        dex.put(null, "no value present"); //the key cannot be null
        System.out.println(dex.entrySet());

        Set<Map.Entry<String, String>> entrySetDex = dex.entrySet(); //declararea listei si,denumire,

        for (Map.Entry<String, String> perecheCuvantsiDefinitiaLui : entrySetDex) {
            System.out.println(perecheCuvantsiDefinitiaLui.getKey() + " = " + perecheCuvantsiDefinitiaLui.getValue());

        }


    }
}
