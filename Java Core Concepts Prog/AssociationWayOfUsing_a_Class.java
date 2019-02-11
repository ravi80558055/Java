// AIM: To learn 2nd way of of accessing a class.(1st was inheritance.)

// WHAT IT IS?: Association is a way of accessing a class by instantiating(creating an obj.) that class.

// WHY TO USE?:- With inheritance we can access only a single class, but with Association we can access as many class we want.

class A{
	int x = 10;
	void m1(){
		System.out.println("Hello A");
	}
}
class B{                       //total members in B: 3
	A a = new A();          //accessing class A with instantiation.
	int y = 20;
	void m2(){
		System.out.println(y);
		a.m1();
		System.out.println(a.x);
	}
}
class Association_way_of_using_a_class{
	public static void main(String...s){
		B b = new B();
		System.out.println(b.y);
		b.m2();
		System.out.println(b.a.x);
		b.a.m1();
	}
}