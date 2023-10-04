package User_input_practice;

import java.util.Scanner;

public class marks_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of English");
        int English = sc.nextInt();
        System.out.println("Enter the marks of Maths");
        int maths = sc.nextInt();
        System.out.println("Enter the marls of Hindi");
        int hindi = sc.nextInt();

        int Obtained = English+maths+hindi;


//        float percentage = (Obtained/300)*100;
//        System.out.println((Obtained/300)*100);
//        System.out.println("The total marks obtained  = " + Obtained);
//        System.out.println("The percentages = " + percentage);
    }
}
