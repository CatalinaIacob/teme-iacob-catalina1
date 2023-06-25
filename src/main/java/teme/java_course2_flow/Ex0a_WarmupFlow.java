package teme.java_course2_flow;

class Ex0a_WarmupFlow {

    static void whichIsBigger(int a, int b) {
        //TODO
    }

    static double max(double a, double b, double c) {
        //TODO
        return -1;
    }

    static String xTimes(String text, int n) {
        //TODO
        return "?";
    }

    static int sumSquares(int n) {
        //TODO
        return -1;
    }

    static long factorial(int n) {
        //TODO
        return -1;
    }

    static byte dayOfWeek(String day) {
        //TODO
        return -1;
    }

    public static void main(String[] args) {

        System.out.println("\nwhichIsBigger():");
        whichIsBigger(3, 1);
        whichIsBigger(1, 3);
        whichIsBigger(3, 3);

        System.out.println("\nmax(1,2,3)= " + max(1, 2, 3));
        System.out.println("max(3,2,1)= " + max(3, 2, 1));
        System.out.println("max(1,3,2)= " + max(1, 3, 2));
        System.out.println("max(3,3,1)= " + max(3, 3, 1));
        System.out.println("max(3,1,1)= " + max(3, 1, 1));
        System.out.println("max(1,3,1)= " + max(1, 3, 1));

        System.out.println("\nxTimes('a',4)= '" + xTimes("a", 4) + "'");
        System.out.println("xTimes('Abc',2)= '" + xTimes("Abc", 2) + "'");

        System.out.println("\nsumSquares(1)= " + sumSquares(1));
        System.out.println("sumSquares(4)= " + sumSquares(4));

        System.out.println("\ndayOfWeek('luni') = " + dayOfWeek("luni"));
        System.out.println("dayOfWeek('DUMINICA') = " + dayOfWeek("DUMINICA"));
        System.out.println("dayOfWeek('ViNeRi') = " + dayOfWeek("ViNeRi"));
        System.out.println("dayOfWeek('invalid') = " + dayOfWeek("invalid"));

        System.out.println("\nfactorial(1) = " + factorial(1));
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("factorial(13) = " + factorial(13));
    }
}
