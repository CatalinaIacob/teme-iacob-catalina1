package java_week1;

public class InterchangeValues {
    public static void  main (String[] args) {


        int a = 10;
        int b = 3;
        int c;

        System.out.println("Valorile inainte de interschimbare sunt " + " a are valoarea "+ a +" b are valoarea " + b);
        c=b;
        b=a;
        a=c;

        System.out.println("Valorile dupa schimbare sunt " + " a are valoarea "+ a +" b are valoarea " + b + " c are valoarea " +c);


    }
}
