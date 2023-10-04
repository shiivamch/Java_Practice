package demoproject;

import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		
//		for(int j=1; j<=10000; j++) {
//		
//		int num = j;
//		int t1 = num;
//		int digit = 0;
//		while(t1>0){
//			t1 /=10;
//			digit++;
//		}
////		System.out.println(digit);
//		int t2 = num;
//		
//		int sum =0;
//		while(t2>0) 
//		{
//			int	rem = t2%10;
//			int multi = 1;
//			for(int i = 1; i<=digit; i++)
//		{
//			multi *= rem;
//		}
//		sum+=multi;
//		t2/=10;
//		}
//		if(num == sum) {
//			System.out.println(j);
//		}
//		}
//		int a = 0;
//		for(int i =1; i<11; i++)
//		{
//			a+=i;
//			
//		}
//		System.out.println(a);
//		int a = 1;
//		int b = 2;
//		
//		for(int i=1; i<=100; i++) {
//			System.out.println(a);
//			int c = a+b;
//			a = b;
//			b=c;
//		}
		
//		int even = 0;
//		int odd = 1;
		Scanner sc = new Scanner(System.in);
//		
//		for(int i=1; i<11; i++ ) {
//	System.out.println("Enter the number");
//			int num = sc.nextInt();
//	
//		if(num%2 == 0) {
//			even+=num;
//		}
//		else {
//			odd*=num;
//		}
//		}
//		System.out.println(even);
//		System.out.println(odd);
		
		
//		System.out.println("Enter the no. to fint its factorial");
//		int fac = sc.nextInt();
//		int ans = 1;
//		
//		for(int i =1; i<=fac; i++) {
//			ans =  ans*i;
//			
//		}
//		
//		System.out.println(ans);
		
		int j = 1;
		while(j<6) {
		for(int i = 1; i<j+1; i++) {
			System.out.print(j + "  ");	
		}
		System.out.println();
		j++;
	 }}
}
