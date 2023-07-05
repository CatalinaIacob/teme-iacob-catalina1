package java_week1;

public class MethodTypes {

    public static void main (String[] args) {
        int a= 10;
        int b= 20;
        int sum= a+b;

        System.out.println(sum);
    }


    public static String sum (int x, int y) {
        int sumaNumerelor = x + y;
        String rezultatulMetodei= "Suma " + sumaNumerelor;
        return  rezultatulMetodei;
    }
}

