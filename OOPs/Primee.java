package demoproject;

public class Primee {

}

class Hello{
	void PrimeNum(int num) {
//		int num = n;
		boolean check = true;
		for(int i = 2; i<num; i++) {
			if(num%i == 0) {
				check = false;
			}
		}
		if(check == true) {
			System.out.println(num + " is an prime no.");
		}
		else {
			System.out.println(num + " is not an prime no.");
		}
	}
}

class ABC{
	public static void main(String[] args) {
		Hello sc = new Hello();
		sc.PrimeNum(13);
	}
}