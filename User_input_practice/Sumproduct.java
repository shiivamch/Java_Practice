package User_input_practice;

import java.util.Scanner;

public class Sumproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the valiue of A");
        int A = sc.nextInt();

        System.out.println("Enter the value of B");
        int B = sc.nextInt();

        System.out.println("The sum of A and B is " + (A+B));
        System.out.println("The product of A and B is " + A*B);
    }
}
