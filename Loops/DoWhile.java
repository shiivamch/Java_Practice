package Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

//        int a = 0;
//
//        do {
//            System.out.println(a+1);
//            a++;
//        }
//        while(a<10);
//        System.out.println("1 to 10 over");
//__________________________________________________________________________


//
//
//        Scanner sc = new Scanner(System.in);
//        int number ;
//
//        do {
//            System.out.println("Please enter a number");
//             number = sc.nextInt();
//
//        }
//        while(number<0);
//        System.out.println("completed");
//        ______________________________________________________________________________
//
//        int number = 0;
//
//        do {
//            if(number%2==0)
//            {
//                System.out.println(number);
//            }
//            number++;
//
//        }
//        while(number<101);

        int a = 0;
        int b = 1;
        int c;

        do {
            System.out.println(a+b);
            a = b;
            c = a;
        }
        while(c<100);
    }
}
