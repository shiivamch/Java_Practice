package Loops;

import java.util.Scanner;

public class LearningLoops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int a = sc.nextInt();

        do {
            System.out.println(a+5);
            a++;
        }
        while(a<1001);
        System.out.println("Loop over");


    }
}
