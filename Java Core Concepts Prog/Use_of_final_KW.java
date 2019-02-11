//AIM: To understand use of 'final' KW with class, method, and variable.

/*WHEN TO USE?
final with class:- If we want to avoid overriding of methods of a class, make it final.
				 - final class cannot be inherited.
final with methods:- If we want to override some methods while some not, then make those methods 
					 final which you don't want to override.
				   - class can be inherited, if not declared final.
final with variable:- value of such variable cannot be changed(see this code), but can be accessed by class.
*/

//final class Final{
class Final{
	int x = 10;
	final int y = 15;
	
	final int z;      //CTError: blank final --> SOLUTION: initialize its value in constructor or initialize block.
	//Solution to above statement.
		Final(){
			//z = 100;
		}
		{
			z = 1000; 
			//y = 5;		//this will show CTError IF variable is initialized when declared.
		}
		
	void m1(){
		System.out.println("Non-final method in Class Final");
	}
	final void m2(){
		System.out.println("Final method in Class Final");
	}
}
class Final_KW extends Final{     //(uncomment line 3 and comment line 4)CTError: final class cannot be inherited
	int x = 20;
	int y = 30; 
	static final int a;   //static member can only be accessed via static method
		Final_KW(){
			//a = 400;     //CTError: non-static member cannot access static member.;
		}
		static{
			a = 350;
		}
		
	void m1(){
		System.out.println("Non-final method in Class Final_KW");
	}
	/* 
	void m2(){         				 //CTError: method is final so you cannot override it.
		System.out.println("Final method in Class Final_KW");
	} 
	*/
}
class Final_main{
	public static void main(String...args){
		Final_KW f = new Final_KW();
		f.m2();
		Final fi = new Final();
		//fi.y = 50;             //CTError: variable is final so you cannot change it's value.
		System.out.println(fi.y);
		System.out.println(f.y);
		System.out.println(f.z);
		
		System.out.println(f.a);
	}
}