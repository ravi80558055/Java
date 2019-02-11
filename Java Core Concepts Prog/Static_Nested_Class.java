//AIM: To understand concept of using static nested class.

/*PTR:- Object creation of STATIC inner class is done via ref. of outer class, bcoz inner is a member of outer class.
	  - Neither inner can access outer's member, nor outer can access inner's member via object creation.
*/	

class Outer{
	int x = 10;
	static int y = 20;    
	void m1(){
		System.out.println(x);
		System.out.println(y);
		
		Inner i = new Inner();
		System.out.println(i.z);   
	}
	 static class Inner{
		 int s = 900;
		int z = 30;
		void m2(){
			System.out.println("Inner class method m2");
			//System.out.println(x);  //CTError: non-static member cannot be accessed from a static context(class).
			System.out.println(y);
		}
	}
}
class Static_Nested_class_main{
	public static void main(String[] args){
		//System.out.println(y);      //CTError: static member is not allowed to be accessed without class or object reference.
		System.out.println(Outer.y);  //static member can be accessed via class reference.
		
		//Inner i = new Inner();    //CTError: static class cannot be instantiated directly.		
		Outer.Inner i = new Outer.Inner();   //calling syntax of obj. of static inner class(which is a member of outer class).
		
		//Outer o = new Outer();              							//Doubt
		//Outer.Inner i =o. new Inner();      							//Doubt
		
		//System.out.println(i.x);  //CTError: (ref. PTR)
		System.out.println(i.z);
		System.out.println(i.s);
		i.m2();    
		//i.m1();     //CTError: (ref. PTR)
	}
}