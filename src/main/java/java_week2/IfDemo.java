package java_week2;

public class IfDemo {
    public static void main(String[] args) {
        boolean condition = true;
        if (condition) {
            System.out.printf(" Am trecut prin if");
        } else {
            System.out.println(" Am trecut prin else");
        }

        int number = 4;
        if (number > 3) {
            System.out.println( "Am trecut prin if");
        }
        else {
            System.out.println( "Am trecut prin else");
        }

        boolean ploua=false;
        if(ploua){
            System.out.println("Nu ud gazonul");
        }
        else{
            System.out.println("Ud gazonul");
        }

        boolean locDeJoaca = true;
        int pretPerNoapte = 150;
        if (locDeJoaca && pretPerNoapte < 400) {
            System.out.println( " Rezerv ");
        }
        else {
            System.out.println(" Mai caut");
        }
    }
}
