//AIM: to understand Multi-level inheritance (all types of Inheritance)

class A{                                    
	//int x = 3;
	private int x = 3;
	void m1(){
		System.out.println(x);
		System.out.println("Hello A");
	}
	A(){
		System.out.println("qwerty");
	}
}
//class B extends A,C{            //multiple Inheritance: Not supported by Java Classes instead by java Interfaces
class B extends A{                      
	int y = 8;
	void m2(){
		System.out.println("Hello B");
	}
	B(){
		System.out.println("asdfgh");
	}
}
class C extends B{             
//class C extends A{           //Hierarichal Inheritance: Supported by both J-Classes and J-Interfaces
	int q = 10;
	void m3(){
		System.out.println("Hello C");
	}
	C(){
		System.out.println("zxcvbnm");
	}
}	
class Multi_level_inheritance{
	static public void main(String[] args){
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.m1();
		
		b.m2();
		b.m1();
		
		c.m3();
		c.m2();                //Comment for hierarichal Inheritance
		c.m1();
		
		System.out.println("This is main method.");
	}
}
// qwerty
// qwerty
// asdfgh
// qwerty
// asdfgh
// zxcvbnm
// 3
// Hello A
// Hello B
// 3
// Hello A
// Hello C
// Hello B
// 3
// Hello A
// This is main method.