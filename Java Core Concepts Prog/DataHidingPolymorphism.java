//Aim: Understand concept of data hiding.

/* 
Data Hiding is a process running internally by JVM if two data mambers of same name exist in both classes
i.e. sub and super class. Due to priority, data member of sub class hides the data member of super class.
(ref. Notes<Diagram>)
*/

class Data1{
	int a = 10;
	void m1(){
		System.out.println("Method overriding 1");
	}
	Data1(){
		System.out.println("Data1");
	}
}
class Data2 extends Data1{
	int a = 100;
	void m1(){
		System.out.println("Method overriding 2");
	}
	Data2(){
		System.out.println("Data2");
	}
}
class Data_Hiding_POLYMORPHISM{
	public static void main(String args[]){
		Data1 y = new Data1();
		
		// 			Data1 y = null;    
					
		// 			Run-time Error: Null Pointer Exception: Bcoz obj. is created but 
		// 			no memory is allocated to it, and we are calling data member by it;s ref.
		
		System.out.println(y.a);
		Data2 x = new Data2();
		x.m1();
		System.out.println(x.a);
	}
}

/*
Data Hiding:- It happens only with data members of class.
			- Data members of any super-class do not get override, because they do not participate in 
			  Run-time Polymorphism. Memory will be allocated to both data members of same name in super-class
			  as well as sub-class.
			- Data hiding is done on priority basis, less prior data member is prone to hide.
 */			