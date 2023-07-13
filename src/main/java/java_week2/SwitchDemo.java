package java_week2;

public class SwitchDemo {
    public static void main(String[] args) {
        int ziuaSaptamanii = 7;
        switch (ziuaSaptamanii) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            default:
                System.out.println("Nu e inceputul saptamnii");
        }
    }
}
