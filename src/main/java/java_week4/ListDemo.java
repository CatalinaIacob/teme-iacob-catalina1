package java_week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo{
    public static void main(String[] args) {
//create new list // arrayList implementation
    List<String> firstNames = new ArrayList<>();

    //check the list size
        System.out.println("The size of list is: " + firstNames.size()); //cate elemente are lista  // 0
        System.out.println("The list is empty? " + firstNames.isEmpty()); //true

        //add elements to list
        firstNames.add("Maria");
        firstNames.add("Ioana");
        firstNames.add("George");
        firstNames.add("Diana");

        System.out.println("The size of list is: " + firstNames.size()); //cate elemente are lista  // 4
        System.out.println("The list is empty? " + firstNames.isEmpty()); // fals

        //allows duplicates

        firstNames.add("Diana");

        System.out.println("The size of list is: " + firstNames.size());
        System.out.println(firstNames);

        //remove one person from the list
        firstNames.remove("Diana"); //sterge primul obiect din lista cu aceasta denumire;
        System.out.println("The list after remove Diana is " + firstNames);

        //get a specific name based on get and index/position
        System.out.println("Get the Ioana element: " + firstNames.get(1));

        //delete the entire list

        firstNames.clear(); //folosite pt a adauga parametru/argumet pt o metoda // mereu () transmit ca ai de-a face cu o metoda
        System.out.println("The list is empty: " + firstNames); //[] metoda de afisarea acolectiilor de date

        //list with objects
//List<nameconstructor> vs<int/String>

        // sort on list
        //la Array foloeam metoda sort din java si dupa o printam cu sout Array.sort(name)

        Collections.sort(firstNames); //se sorteaza si se salveaza lista in memorie
        System.out.println(firstNames); //se afiseaza lista sortata

        for (String firstName : firstNames) {
   if(firstName.equals("Diana"))
       System.out.println(firstName);
   //daca nu am acolade dupa if executa doar primul sout, dca vreau sa execute mai multe sout unul dup altul avem nevoie de acolade dupa if
        }




}
}
