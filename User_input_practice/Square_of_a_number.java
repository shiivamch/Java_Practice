package User_input_practice;

import java.util.Scanner;

public class Square_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        System.out.println("The square of a is " + a*a);
    }
}
