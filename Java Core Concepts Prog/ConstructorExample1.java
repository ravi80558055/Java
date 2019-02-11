//Show that constructor gets called when the object gets created

class Constructors1{
	public static void main(String...s){
		Example1 a = new Example1(3, "qwetyu");
		Example1 b = new Example1(4, "asdf");
		a.method();
		b.method();
	}
}
class Example1{
	int x;
	String y;
	void method(){
		System.out.println(x+y);
	}
	Example1(int a, String b){
		x = a;
		y = b;
		System.out.println("This is a Constructor.");
	}
}