/* WHAT IS CONSTRUCTOR?
--> It is a special method which executes when the object of the class constructed.
*/
class Constructors{
	public static void main(String...s){
		Example a = new Example();      //non-parameterized constructor calling (called at obj. creation)
		Example b = new Example();      //non-parameterized constructor calling (called at obj. creation)
		a.method();
		b.method();
	}
}
class Example{
	int x;
	String y;
	void method(){
		System.out.println(x+y);
	}
	Example(){
		System.out.println("This is a Constructor.");
	}
}

/* 
	Example b = new Example(); 
	--> this line works as: An instance/obj. 'b' of class 'Example' will be allocated 'new' memory space
		and the default values to each data, while we call the constructor using class name as a function like 
		'Example()' which will return the default at the time when object is created.
*/
/*Features of constructors
- name of constructor must be same as the name of the class.
- programmer cannot add return type(void, int,...) to a constructor, as it have one by default 
  and uses it internally.
  (MYTH: constructor do not return anything)
  (TRUTH: Constructor do return the default values set by the 'new' keyword during obj.s creation, 
		  that's why an obj. is created)
- Constructor cannot be called explicitly, means: a.Example();  is wrong and gives CTError.
- It can only be called at the time of obj. creation.
- Constructor will reun just once for an object.

- If a constructor is not defined by programmer, then JVM creates an empty constructor internally, and then
  prints the default value of data assigned by 'new' keyword.
*/

/* 
Prove that the default value to data is assigned using 'new' keyword and not by Constructor calling.
--> If we create an empty constructor of a class in our program, and executes it.
--> What we get is again the default values of our data, this proves that def. values are assigned
	to variables via 'new' keyword at the time of obj. creation.
*/	