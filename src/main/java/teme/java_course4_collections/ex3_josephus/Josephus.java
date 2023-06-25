package teme.java_course4_collections.ex3_josephus;

class Josephus {

    /**
     * @return the number of the last remaining soldier
     */
    static int eliminate(int total, int step) {
        System.out.println("\nTotal soldiers: " + total + ", will eliminate them with step: " + step);

        //TODO!!
        int remaining = -1;

        System.out.println("Last standing: " + remaining);
        return remaining;
    }


    /**
     * Some manual tests
     */
    public static void main(String[] args) {
        System.out.println(eliminate(1, 1));  //prints: 1
        System.out.println(eliminate(3, 1));  //3
        System.out.println(eliminate(3, 3));  //2
        System.out.println(eliminate(5, 2));  //3
        System.out.println(eliminate(5, 3));  //4
        System.out.println(eliminate(5, 7));  //4
        System.out.println(eliminate(10, 3)); //4
    }
}
