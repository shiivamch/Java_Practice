package Demo;

import java.util.Scanner;
public class Input_system {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*******Even - Odd Checker********");
        System.out.println("Enter the number");


        int number = sc.nextInt();

        if (number%2==0)
        {
            System.out.println(number +"is an even no.");
        }
                else if(number%2!=0)
        {
            System.out.println(number + "is an odd no.");
        }
                else
        {
            System.out.println("Invalid input");
        }


    }
}
