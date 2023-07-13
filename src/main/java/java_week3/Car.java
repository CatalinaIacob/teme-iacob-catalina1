package java_week3;

public class Car {
    //public static void main(String[] args) {

        String marca;
        String culoare;
        String model;

       CarEngine motor;
       Carwheels roti;

       public void start(){
           if (motor.caiputere < 100 ) {
               System.out.println( "Vruum");
           } else {
               System.out.println("Vruum, Vruuum");
           }

        }

    }
    public String Descriere () {
        return "Brand: " + marca + "Nuanta: " + culoare + " Design: " + model;
    }
}
