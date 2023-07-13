package java_week3;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.marca=" BMW ";
        car1.culoarea= "rosu";
        car1.model= "electric";

        CarEngine engine1= new CarEngine();
        engine1.capacitatecilindrica= 2000;
        engine1.caiputere= 100;

        car1.motor= engine1;

        car1.roti= new Carwheels[] {new Carwheels(), new Carwheels(), new Carwheels(), new Carwheels()};
        System.out.println(car1.Descriere());

        Car car2= new Car();
        CarEngine engine2= new CarEngine();
        car2.marca= "Mercedes";
        car2.model= "GLA";
        car2.culoare= "alb";

        car2.motor= engine2;


    }
}
