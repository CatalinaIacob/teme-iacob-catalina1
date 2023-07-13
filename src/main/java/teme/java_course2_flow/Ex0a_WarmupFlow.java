package teme.java_course2_flow;

class Ex0a_WarmupFlow {

    static void whichIsBigger(int a, int b) {
        if (a > b) {
            System.out.println("First number is bigger");
        } else if (a < b) {
            System.out.println("Second number is bigger");
        } else {
            System.out.println("Numbers are equal");
        }
    }

    static double max(double a, double b, double c) {
        int maxValues = (int) (a / b / c);
        if (a >= b && a >= c) {
            System.out.println(a + " is the maximum number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the maximum number.");
        } else {
            System.out.println(c + " is the maximum number.");
        }

        return maxValues;
    }

    static String xTimes(String text, int n) {
        String temp = "";
        for (int i = 0; i < n; i++)
            temp += text;
        return temp;
    }

    static int sumSquares(int n) {
        int sum = n;
        for (int i = 0; i < n; i++)
            sum += ((i * i) + (i*i));
        return sum; //nu sunt multumita de rezultat

    }

    static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    static String dayOfWeek(String x) {
        String dayOfWeek= "day";
        if ("day" == "Luni") {
            System.out.println(1);
        } else if (dayOfWeek == "Marti") {
            System.out.println("day"+ 2);
        } else if (dayOfWeek == "Miercuri") {
            System.out.println("day"+ 3);
        } else if (dayOfWeek == "Joi") {
            System.out.println(4);
        } else if (dayOfWeek == "Vineri") {
            System.out.println(5);
        } else if (dayOfWeek == "Sambata") {
            System.out.println(6);
        } else if (dayOfWeek == "Duminica") {
            System.out.println(7);
        } else {
            System.out.println(-1);
        }
        return dayOfWeek;
    }



    public static void main(String[] args) {

//        System.out.println("\nwhichIsBigger():");
//        whichIsBigger(3, 1);
//        whichIsBigger(1, 3);
//        whichIsBigger(3, 3);
//
//        System.out.println("\nmax(1,2,3)= " + max(1, 2, 3));
//        System.out.println("max(3,7,1)= " + max(3, 7, 1));
//        System.out.println("max(1,3,2)= " + max(1, 3, 2));
//        System.out.println("max(3,3,1)= " + max(3, 3, 1));
//        System.out.println("max(3,11,1)= " + max(3, 11, 1));
//        System.out.println("max(1,3,1)= " + max(1, 3, 1));

//        System.out.println("\nxTimes('a',4)= '" + xTimes("a", 4) + "'");
//        System.out.println("xTimes('Abc',2)= '" + xTimes("Abc", 2) + "'");
//
//        System.out.println("\nsumSquares(1)= " + sumSquares(1));
//        System.out.println("sumSquares(4)= " + sumSquares(4));

        System.out.println("\ndayOfWeek('luni') = " + dayOfWeek("luni"));
        System.out.println("dayOfWeek('DUMINICA') = " + dayOfWeek("DUMINICA"));
        System.out.println("dayOfWeek('ViNeRi') = " + dayOfWeek("ViNeRi"));
        System.out.println("dayOfWeek('invalid') = " + dayOfWeek("invalid"));
//
//        System.out.println("\nfactorial(1) = " + factorial(1));
//        System.out.println("factorial(5) = " + factorial(5));
//        System.out.println("factorial(13) = " + factorial(13));
//    }

    }}