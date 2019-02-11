//Constructor overloading is a concept of having two or more constructors in the <Blueprint> Class.

class Constructor_overloading{
	public static void main(String...s){
		Example_overloading a = new Example_overloading(3, "qwetyu");
		Example_overloading b = new Example_overloading();
		a.method();
		b.method();
	}
}

//blueprint
class Example_overloading{
	int x;
	String y;
	void method(){
		System.out.println(x+y);
	}
	Example_overloading(int a, String b){            //parameterized constructors
		x = a;
		y = b;
		System.out.println("This is a Constructor.");
	}
	Example_overloading(){
		System.out.println("This is an example of Constructor overloading.");
	}
}