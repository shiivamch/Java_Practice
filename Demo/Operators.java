    package Demo;

public class Operators {
    public static void main(String args[]){
        //    Arithmetic Operaators
        int a = 5;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

//        Comparison/Relational Operators
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);


        //     Assigment  Operators

        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);

//        Logical Operators

        System.out.println(a>b && b<a);
        System.out.println(a>b || b<a);

//        Unary Operators

        a++;
        System.out.println(a++);
        System.out.println(a--);

        ++a;
        System.out.println(++a);
        System.out.println(--a);

//        Bitwise Operators



}
}

