//AIM: To understand use of super keyword and the flow of chaining between constructors.

class A2{                                 
	//int x = 3;
	private int x = 3;
	void m1(){
		System.out.println(x);
		System.out.println("Hello A");
	}
	A2(){
		System.out.println("Hii A");
	}
	A2(int p){
		//this();                 //try for more complex flow of constructor chaining.
		System.out.println("The argument is = "+p);
	}
}
class B2 extends A2{            
	int y = 8;
	void m2(){
		System.out.println("Hello B");
	}
	B2(){
		super();
		//super(5);
		System.out.println("Hii B");
	}
	B2(int q){
		//super(6);				//try for more complex flow of constructor chaining.
		System.out.println("The argument is = "+q);
	}
}	
class Super_keyword_as_CCS{
	static public void main(String[] args){
		A2 a = new A2();
		B2 b = new B2(7);
		b.m1();
		b.m2();
		a.m1();
		System.out.println("This is main method.");
		System.out.println(b.y);
	}
}