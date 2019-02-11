//AIM: To understand how inheritance takes place between interface and interface, and how to use them in class.

interface One{
	void m1();    //by def. abstract, static, final and public.(property of interface)
	void m2();    //by def. abstract, static, final and public.(property of interface)
}
interface Two{
	void m1();
	void m3();
}
interface Three extends One,Two{  //inheriting multiple interfaces (interface -> interface: KW used- extends)
	void m4();
}
class X implements One{
	public void m1(){
		System.out.println("This is X m1");
	}
	public void m2(){
		System.out.println("This is X m2");
	}
}
class Y implements Two{
	public void m1(){
		System.out.println("This is Y m1");
	}
	public void m3(){
		System.out.println("This is Y m3");
	}
}
class Z implements Three{
	public void m1(){                          //As the interface is by def. abstract means we have to override all the methods of parent.
		System.out.println("This is Z m1");    //As the interface is by def. abstract means we have to override all the methods of parent.
	}                                          //As the interface is by def. abstract means we have to override all the methods of parent.
	public void m2(){                          //As the interface is by def. abstract means we have to override all the methods of parent.
		System.out.println("This is Z m2");    //As the interface is by def. abstract means we have to override all the methods of parent.
	}                                          //As the interface is by def. abstract means we have to override all the methods of parent.
	public void m3(){                          //As the interface is by def. abstract means we have to override all the methods of parent.
		System.out.println("This is Z m3");    //As the interface is by def. abstract means we have to override all the methods of parent.
	}                                          //As the interface is by def. abstract means we have to override all the methods of parent.
	public void m4(){                          //As the interface is by def. abstract means we have to override all the methods of parent.
		System.out.println("This is Z m4");    //As the interface is by def. abstract means we have to override all the methods of parent.
	}                                          //As the interface is by def. abstract means we have to override all the methods of parent.
}
class Inheritance_between_interfaces{
	public static void main(String[] args){
		One a = new X();    //X ke obj. ko One ke reference(a) me hold karke usi se call kar rahe hai.
		a.m1();
		a.m2();
		//a.m3();    //CTE bcoz m3 and m4 are not in One.
		//a.m4();    //CTE bcoz m3 and m4 are not in One.
		
		//A a1 = new Y();   //CTE: Only parent(or parent of parent) can hold it's child.
		Two b = new Y();      //Run fine: bcoz parent(Two) is holding its direct child(Y).
		b.m1();
		//b.m2();      //CTE bcoz m2 and m4 are not in Two.
		b.m3();
		//b.m4();      //CTE bcoz m2 and m4 are not in Two.
		
		One a1 = new Z();   //Z ke obj. ko One ke reference(a1) me hold karke usi se call kar rahe hai.
		a1.m1();      //Z is direct child of Three and Three is direct child of One,Two. Hence Z is indirect child of One,
		a1.m2();      //bcoz of this,only those methods will run which are present in reference i.e. One.
		//a1.m3();   //CTE bcoz m3 and m4 are not in One.
		//a1.m4();   //CTE bcoz m3 and m4 are not in One.
		
		Two b1 = new Z();  //Z ke obj. ko Two ke reference se call kar rahe hai.
		b1.m1();      //Z is direct child of Three and Three is direct child of One,Two. Hence Z is indirect child of One,
		b1.m3();      //bcoz of this,only those methods will run which are present in reference i.e. Two.
		//b1.m2();   //CTE bcoz m2 and m4 are not in Two.
		//b1.m4();   //CTE bcoz m2 and m4 are not in Two.
		
		Three c = new Z();
		c.m1();    //every method will run fine, becaus Three is parent of One,Two , hence holds all the methods of One,Two and its own.
		c.m2();    //every method will run fine, becaus Three is parent of One,Two , hence holds all the methods of One,Two and its own.
		c.m3();    //every method will run fine, becaus Three is parent of One,Two , hence holds all the methods of One,Two and its own.
		c.m4();    //every method will run fine, becaus Three is parent of One,Two , hence holds all the methods of One,Two and its own.
	}
}

//PTR:(ref. line 59-61 and 65-67)Compile-time pe decide hua ki m1,m2 interface One ke chalenge, but run-time pe chalenge Z ke.


// op
// This is X m1
// This is X m2
// This is Y m1
// This is Y m3
// This is Z m1
// This is Z m2
// This is Z m1
// This is Z m3
// This is Z m1
// This is Z m2
// This is Z m3
// This is Z m4