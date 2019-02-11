//Aim: Understand concept of Upcasting in Run-time Polymorphism.

//Run-time Polymorphism is a combined concept of Method Overriding and Up-casting.

// WHEN TO USE?: Used when we have different files and we want to use them in one single file.

// 		During Compile time, compiler binds(Scans) the member of class via name/ref., not via object.
// 		But during Run-time, JVM calls the member of class by object of that class.

class Parent{
	int a = 10;
	void m1(){
		System.out.println("Parent Class");
	}
}
class Child extends Parent{
	int a = 100;              
	void m1(){
		System.out.println("Child Class");     
	}
}
class Typecasting__Upcasting{
	public static void main(String args[]){
		Parent y = new Parent();
		y.m1();
		System.out.println(y.a);
		
		y = new Child();         //Upcasting(Parent bada hota hai, child chota hota hai.)
		y.m1();
		System.out.println(y.a);                   //Doubt
		Child x = new Child();
		Parent p = x;            //Up-casting
		//Child q = p;           //CTError: Direct downcasting: Data loss(bacche ko baap ka baap banana)
		//Child q = (Child)p;      //Downcasting
	}
}