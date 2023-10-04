package User_input_practice;

import java.util.Scanner;

public class Square_area_and_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a side of Square");
        int a = sc.nextInt();

        System.out.println("Area of square = " +(a*a));
        System.out.println("Perimeter of square = "+ 4*a);
    }
}
