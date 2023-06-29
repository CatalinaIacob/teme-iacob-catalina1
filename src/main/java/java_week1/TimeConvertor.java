package java_week1;

public class TimeConvertor {
    public static void main(String[] args) {
        int oraCurenta = 3;
        int oraInMilisecunde = oraCurenta * 60 * 60 * 1000;

        System.out.println(oraInMilisecunde);
        System.out.println("ora " + oraCurenta + " este formata din " + oraInMilisecunde);
    }
}
