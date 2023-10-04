package LearnOOPs;

public class Practice1 {
}


//----------------------------QUESTION NO. 01 ---------------------------------------------------------

//abstract class Parent{
//	
//	abstract void message();
//	
//}
//
//	class Child1 extends Parent
//	{
//			void message(){
//				System.out.println("This is 1st sub - class");
//			}
//	}
//	
//	class Child2 extends Parent
//	{
//			void message(){
//				System.out.println("This is 2nd sub - class");
//			}
//	}
//	
//	class Print{
//		public static void main(String[] args) {
//		
//		Child1 ch1 = new Child1();
//		Child2 ch2 = new Child2();
//		
//		ch1.message();
//		ch2.message();
//		}
//		
//	}



//--------------------------------------QUESTION NO. 02 ---------------------------------------------------


//abstract class Bank{
//	
//	abstract void getBalance();
//}
//
//	class BankA extends Bank{
//		
//		void getBalance() {
//			
//			System.out.println("$100 deposited in BankA");
//		}
//	}
//	
//class BankB extends Bank{
//		
//		void getBalance() {
//			
//			System.out.println("$150 deposited in BankB");
//		}
//	}
//
//class BankC extends Bank{
//	
//	void getBalance() {
//		
//		System.out.println("$200 deposited in BankC");
//	}
//}
//
//class Test2{
//	
//	public static void main(String[] args) {
//
//		BankA a = new BankA();
//		BankB b = new BankB();
//		BankC c = new BankC();
//		
//		a.getBalance();
//		b.getBalance();
//		c.getBalance();
//	}
//}


//------------------------------------QUESTION NO. 05 ---------------------------------------------------

//abstract class Animals {
//	
//	abstract void cats();
//	abstract void dogs();
//}
//
//class Cats extends Animals{
//	
//	void cats() {
//		System.out.println("Cats meow");
//	}
//}
//
//class Dogs extends Animals{
//	
//	void dogs() {
//		System.out.println("Dogs Bark");
//	}
//}
//
//class print1{
//	
//	public static void main(String[] args) {
//		
//	Cats C = new Cats();
//	Dogs D = new Dogs();
//	
//	C.cats();
//	D.dogs();
//}
//}


//------------------------------------------ QUESTION NO. 06 --------------------------------------------------

//abstract class Shape{
//	
//	abstract void RectangleArea(int a, int b);
//	abstract void SquareArea(int a);
//	abstract void CircleArea(int a);
//}
//
//class Area extends Shape{
//	
//	void RectangleArea(int a, int b) {
//		System.out.println("Area of Rectangle is :- " + a * b);
//		
//		this.breadth = b;
//		this.length = a;
//	}
//	
//	void SquareArea(int a) {
//		System.out.println("Area of Square is :- " + a * a);
//		
//		this.side = a;
//	}
//	
//	
//	void CircleArea(int a) {
//		System.out.println("Area of Circle is :- " + 3.14*(a*a));
//		
//		this.radius = a;
//	}
//	
//	int length = 0;
//	int breadth =0;
//	int radius = 0;
//	int side = 0;
//}
//
//class Print6{
//	
//	public static void main(String[] args) {
//		
//		Area ar = new Area();
//		ar.CircleArea(5);
//		ar.RectangleArea(5, 7);
//		ar.SquareArea(7);
//	}
//}


//------------------------------------- QUESTION NO. :- 04 ----------------------------------------------------

  abstract class Abstract{
	  
	  Abstract(){
		  System.out.println("This is an constructor of Abstract class");
	  }
	  
	  abstract void a_method();
	  
	  void Subclass() {
		  
		  System.out.println("This is a normal class of ");
	  }
  }
  
  