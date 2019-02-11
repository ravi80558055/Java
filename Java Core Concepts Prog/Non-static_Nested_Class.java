//AIM: To understand concept of using non-static nested class.

/*PTR:- Object creation of NON-STATIC inner class is done via ref. of outer class, bcoz inner is a member of outer class.
	  - Neither inner can access outer's member, nor outer can access inner's member via object creation.(line 37, 39)
*/	

class Outer_class{
	int x = 10;
	static int y = 20;    //static member is commom sharable member for each object of the class
	void m1(){
		System.out.println(x);
		System.out.println(y);
		//System.out.println(z);     //CTError: not allowed to access local variable.
		
		Inner_class i = new Inner_class();
		System.out.println(i.z);   //Run fine: local var. can only be accessed via obj reference.
	}
	class Inner_class{
		//static int s = 900;
		int z = 30;
		void m2(){
			System.out.println("Inner class method m2");
			System.out.println(x);
			System.out.println(y);
		}
	}
}
class Nested_class_main{
	public static void main(String[] args){
		//methods of accessing variable 'x'
		//System.out.println(x);   //CTError: x is not a local variable for this class (Nested_class_main)
		
		//Inner_class i = new Inner_class();    //CTError:  direct obj. creation is not allowed for inner class.
		Outer_class o = new Outer_class();
		System.out.println(o.x);
		System.out.println(o.y);
		//System.out.println(o.z);     //CTError: members of inner class are not accessed via outer class.
		o.m1();
		//o.m2();               //CTError: members of inner class are not accessed via outer class.
		
		Outer_class.Inner_class i = o.new Inner_class();   //obj. creation syntax for NON-STATIC inner class
		//System.out.println(i.x);      //CTError: members of outer class are not accessed via inner class.
		System.out.println(i.z);
		
		//i.s = 987;        //Value of s can be changed, means s cannot be declared static in inner class.
		//System.out.println(i.s);
		
		//i.m1();         //CTError: members of outer class are not accessed via inner class.
		i.m2();         
		//System.out.println(o.z);     //CTError: members of outer class are not accessed via inner class.
	}
}