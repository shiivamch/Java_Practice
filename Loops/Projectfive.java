package Loops;

public class Projectfive {

	public static void main(String[] args) {
		
//		initialize value 
		int num = 153;
		int digits = 0;
		int temp1 = num;
		
		
		
		while(temp1>0)
		{
			digits++;
			temp1/=10;
			
		}
		int temp2 = num;
		int rem, result = 0;
		
		while(temp2>0)
		{
			int multiply=1;
			rem=temp2%10;
			
			for(int i = 0; i<digits; i++)
			{
				multiply = rem*rem;
				
				}
			result += multiply;
			temp2/=10;
			
		}
		if(result == num)
		{
			System.out.println(num + "is a armstrong no.");
		}
	}
}
