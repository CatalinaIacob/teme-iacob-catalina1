package java_week2;

public class IfElseIfDemo {
    public static void main(String[] args){
        char grade = 'D';
                if (grade == 'A'){
                    System.out.println( "Excellent");
                }
                else if (grade == 'B'|| grade == 'C') {
                    System.out.println( " Well done!");
                }
                else if (grade == 'D'){
                    System.out.println("You pssed.");
                }
                else if(grade == 'F'){
                    System.out.println("Try again.");
                }
                else{
                    System.out.println("Invalid grade.");
                }

                int ora = 17;
                if (ora < 12){
                    System.out.println("Este dimineata");
                }else if(ora <=14){
                    System.out.println("Este pranz");
                }else if (ora>14){
                    System.out.println("Este dupa amiaza");
                }else{
                    System.out.println("Este seara");
                }
    }
}

