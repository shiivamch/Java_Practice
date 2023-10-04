package Operators_practice;

public class Reverse {

    public static void main(String[] args) {

        int number = 123;

        int first = number/100;
        number%=100;


        int second = number/10;
        int third = number%10;

        System.out.println(third*100+second*10+first);
    }
}
