package demoproject;

public class Inheritance {

}
//in in heritence child calss can access parents property
//types of inheritence
//1.single inheritence
//2.Hierarchical inheritence
//3.multilevel
//4.MUltiple
//5. Hybrid


//animal = eat walk

//Human = read, write
//student = study , work

//cat = meow
//persian = furr

//class Animal{
//	
//	void Eat(){
//		System.out.println("Animal can eat");
//	}
//	void Walk() {
//		System.out.println("Animals can walk");
//	}
//}
//
//class Human extends Animal{
//	
//	void Read(){
//		System.out.println("Animal can read");
//	}
//	void Walk() {
//		System.out.println("Animals can write");
//	}	
//}
//
//class Student extends Human{
//	void Work(){
//		System.out.println("Animal can Work");
//	}
//	void Study() {
//		System.out.println("Animals can Study");
//	}
//}
//
//class cat extends Animal{
//	
//	void Meow() {
//		System.out.println("Meow");	
//	}
//}
//
//class Persiancat extends cat {
//	
//	void Furr() {
//		System.out.println("High Furr");
//		
//	}
//}
//
//class Call{
//	public static void main(String[] args) {
//		
//	Persiancat p = new Persiancat();
//	Student s = new Student();
//	
//	s.Read();
//}
//}

//class ParentA{
//	
//	void same() {
//		System.out.println("A");
//	}
//	
//}
//
//class ParentB{
//	
//	void same() {
//		System.out.println("B  ");
//	}
//}
//
//class child extends ParentA,ParentB{
//	
//	ParentA A = new ParentA();
//	ParentB B = new ParentB();
//}

//class parent{
//
//	void A() {
//		System.out.println("This is a parent class");
//	}
//}
//
//class child extends parent{
//	
//	void B() {
//		System.out.println("This is a subclass");
//	}
//}
//
//class print{
//	public static void main(String[] args) {
//		
//	parent a = new parent();
//	child b = new child();
//	
//	a.A();
//	b.B();
//	b.A();
//	}
//}
//
//
//class Vehicle{
//	
//	
//	int make = 1994;
//	int model = 1995;
//	int year = 2023;
//	
//	void Details() {
//	System.out.println("make "+ make);
//	System.out.println("year "+ year);
//	System.out.println("model "+ model);
//	}
//	}
//
//
//class Car extends Vehicle{
//	
//	int numDoors = 4;
//	void Carinfo() {
//		System.out.println("no. of doors is " + numDoors );
//	}
//}
//
//class Bike extends Vehicle{
//	
//	boolean istwoSeater = true;
//	void bikeinfo() {
//		System.out.println("Two seater "+ istwoSeater);
//	}
//}
//
//class Show{
//	public static void main(String[] args) {
//		Car A = new Car();
//		Bike B = new Bike();
//		
//		B.bikeinfo();
//	}
//}


// POLYMORPHISM
	// polymorphism is used to   



// method overriding 
//
//class AA{
//	
//	void D(){
//		
//		System.out.println("D is displayed");
//	}
//}
//
//class BB extends AA{
//	void D() {
//		
//		System.out.println("D is not displayed");
//	}
//}
//
//class CC extends AA{
//	
//	
//}
//
//
//class DD{
//	
//	public static void main(String[] args) {
//		
//		CC c = new CC();
//		BB b = new BB();
//		
//		c.D();
//		b.D();
//}
//}


// OVERLOADING BY INCREASING RHE NO. OF PARAMETERS

class Z{
	
	void show() {
		
		System.out.println("Show is displayed");
	
	}
	
	void show(int x, int y) {
		
		System.out.println(x + "and " + y + " is displayed");
	
	}

	void show(int x) {
	
	System.out.println("Show is displayed");

}
	public static void main(String[] args) {
	 
		Z z = new Z();
		z.
		
}
}