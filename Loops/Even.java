package Loops;

public class Even {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		do
		{
			if(a%2==0)
			{
				System.out.println(a);
//			a++;
			}
			a++;
//			a+2;
			
		}
		while(a<100);
		System.out.println(a);
	}
}  
