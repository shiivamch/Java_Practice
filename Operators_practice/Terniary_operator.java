package Operators_practice;

import java.util.Scanner;

public class Terniary_operator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        System.out.println(a>70?"Greater no." : "lowest no.");
    }
}
