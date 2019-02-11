//PROBLEM STATEMENT: Show that memory will be first alloted to super class and then to sub class.
//proved using constructor calling i.e. when new obj. is created.

class A1{                                 
	//int x = 3;
	private int x = 3;
	void m1(){
		System.out.println(x);
		System.out.println("Hello A");
	}
	A1(){
		System.out.println("Hii A");
	}
}
class B1 extends A1{            
	int y = 8;
	void m2(){
		System.out.println("Hello B");
	}
	B1(){
		//super();			//constructor chaining statement like 'this();'.
		System.out.println("Hii B");
	}
}	
class Single_inheritance1{
	static public void main(String[] args){
		A1 a = new A1();
		B1 b = new B1(); //prints: Hii A and Hii B, as by default super(); keyword is set by JVM in order to Chain constructors of different classes.
		b.m1();
		b.m2();
		a.m1();
		//a.m2();		//CTError as 'A' don't have functionalities of class B.
		System.out.println("This is main method.");
		//System.out.println(b.super.x);	//gives CTError, bcoz super is not allowed outside the sub-class.
		System.out.println(b.y);
	}
}


/* SUPER() keyword
super(); used when JVM encounter extends keyword.
super(); is also a constructor chaining statement used to chain constructors(or mtd.s) of super class.
It is always used within the sub-class and is not accessible outside it. (ref.- uncomment line 34 & 5, comment line 6 and run the program.)
 */
 
/* 
super();
- can be called by JVM by def. if not written with 0 paramenters, while this(); is not called by def.
- used to call constructors of super-class, whereas this(); is used to call constructors of the same class.
- cannot be accessed outside the sub-class.
- It's working is same as 'this();'.
*/