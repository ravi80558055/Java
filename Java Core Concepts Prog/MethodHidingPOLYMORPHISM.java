//Aim: Understand concept of Method Hiding.

//Condition for Method Hiding: Name must be same, and function must be static.
//--> static ka instance ek hi baar banta hai, that's why function must be static for Method Hiding.
//--> while non-static for method overriding.


class Class1{
	int a = 10;
	void m1(){
		System.out.println("Method Override 1");
	}
	static void m2(){
		System.out.println("Method Hiding Class1");
	}
}
class Class2 extends Class1{
	int a = 100;               //data member gets override
	void m1(){
		System.out.println("Method Override 2");     //This m1() overrides the m1() of parent class.
	}
	static void m2(){
		System.out.println("Method Hiding Class2");  //This m2() hides the m2() of parent class.
	}
}
class Method_Hiding_POLYMORPHISM{
	public static void main(String args[]){
		//Class1.m1();	//CTError : non-static member called via class reference
		Class1.m2();
		//Class1.m1();	//CTError : non-static member called via class reference		
		Class2.m2();
		Class1 y = new Class1();
		y.m1();
		System.out.println(y.a);
		
		Class2 x = new Class2();
		x.m1();
		System.out.println(x.a);
	}
}