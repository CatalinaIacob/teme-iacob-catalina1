package java_week4;

import java.util.*;

public class Practice {

    /* 1.Write a Java Method to insert elements (colors) into a linked list at the first and last positions. */

    public static void colorList() {
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("rosu");
        colorList.add("verde");
        colorList.add("galcen");
        colorList.add("mov");
        System.out.println("Lista initiala este: " + colorList);

        colorList.addFirst("portocaliu");
        colorList.addLast("negru");
        System.out.println("Lista modificata este: " + colorList);


    }

    /* 2. Write a Java Method to iterate through all elements in a sorted set (with names).
          Print only the values that are starting with "A".
          Display a message in case there are names that are not starting with "A". */

    public static void sortedSet() {
        Set<String> names = new TreeSet<>();
        names.add("Ana");
        names.add("Gigi");
        names.add("Alexandra");
        names.add("Alina");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println("Afiseaza numele cu A: " + name);
            } else {
                System.out.println("nu este cu A");
            }
        }
    }


    /* 3. Write a Java Method to find maximum element in ArrayList. */
    public static void maxValue() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        System.out.println("Numarul maxim este: " + Collections.max(numbers));

    }

    /* 4. Create a list with ages (populated with 5 values).
          Create a Java method that will calculate the average of the values existing on the list.
     */

    public static void averageAge() {
        List<Integer> ages = new ArrayList<>();
        ages.add(27);
        ages.add(31);
        ages.add(22);
        ages.add(39);
        ages.add(44);
        int sum = 0;

        for (Integer age : ages) {
            sum += age;
        }

        System.out.println("Average este: " + (double) sum / ages.size());


    }

    public static void main(String[] args) {
//         colorList();
//        sortedSet();
//         maxValue();
        averageAge();
    }
}