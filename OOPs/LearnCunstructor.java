package LearnOOPs;

public class LearnCunstructor {
}

class Demo{
	
	Demo(){
		System.out.println("This is Default constructor");
	}
	
	Demo(int a){
		this.x = a;
		System.out.println("This is 1st parameterized constructor");
	}
	Demo(int a, int b){
		this.y = b;
		this.x = a;
		System.out.println(a+b);
	}
	Demo(int a, int b, String c){
		this.y = b;
		this.x = a;
		this.name = c;
		System.out.println(a+b + c);
	}
	
	int x =0;
	int y = 0;
	String name = " ";
}

class Test{
	
	Demo d = new Demo();
	
	
}
   