/* PROBLEM STATEMENT: If we have a class to perform a task, and we want to add some additional features to it,
but old class must exist, then instead of writing the same code again for another class we can
inherit old class members using 'extends' keyword and use them via reference of new class.
*/

//Single Inheritance: two classes, in which one is super and another one is sub-class.

class A{                                     //Super/base/parent class
	//int x = 3;
	private int x = 3;
	void m1(){
		System.out.println(x);
		System.out.println("Hello A");
	}
}
class B extends A{                           //Sub/derived/child class
	int y = 8;
	void m2(){
		//System.out.println(x);        //CTError as 'x' have private access.(If 'x' is not private, it will run.)
		System.out.println("Hello B");
	}
}	
class Single_inheritance{
	static public void main(String[] args){
		B b = new B();
		b.m1();
		b.m2();
		System.out.println("This is main method.");
		System.out.println(b.y);
		//System.out.println(b.x);		//CTError as 'x' have private access.(If 'x' is not private, it will run.)
	}
}

/* 
	MYTH: private members cannot be inherited.
	TRUTH: private members can also be inherited, but is not accessible in new class.
*/
 
//PTR: private members can only be accessed outside the class via public method.