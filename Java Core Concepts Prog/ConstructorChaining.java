//constructor chainning is done with the help of 'this();' keyword, also known as- Constructor chaining Statement
//this(); --> It holds the path of current object.

/* WHY WE SHOULD USE 'this()'?
--> If we want one constructor to perform operations of another constructor as well, then instead of writing
	the same code again, we should prefer to use 'this();' keyword.
--> Make the program effective.
--> Effective means no repetation of the statements/code, which is non-effective way of programming.
*/

class Constructor_chaining{
	public static void main(String...s){
		Example_chaining a = new Example_chaining(3, "qwety");
		a.method();
		Example_chaining b = new Example_chaining();
		b.method();
	}
}

//blueprint
class Example_chaining{
	int x;
	String y;
	void method(){
		System.out.println(x+y);
	}
	
	//Constructor chaining alternative (non-effective way of programming)
	/* Example_chaining(int a, String b){
		System.out.println("This is an example of Constructor Chaining alternative.");   
		x = a;                                                                           
		y = b;                                                                           
		System.out.println("This is a Constructor.");
	}
	 */
	Example_chaining(int a, String b){
		this();
		//this(2);	//(PROOF: PTR-3)
		x = a;
		y = b;
		System.out.println("This is a Constructor.");
	} 
	Example_chaining(){
		//this();       	//recursive constructor invocation i.e. CTError
		//this(6,"zxcv");   //recursive constructor invocation i.e. CTError check by uncommenting this and commenting line 37.
		System.out.println("This is an example of Constructor Chaining alternative.");
	}
	Example_chaining(int n){
		//do nothing
	}
}

/*
PTR:- their should not be any recursive constructor invocation, means 1st constructor is calling 2nd 
	  and 2nd is again calling first one or a constructor is calling itself as in line 43. 
	  So, this will never return anything and give CTError.
	- 'this();' must be the first statement in constructor if chaining is being done.
	- We cannot chain more than one constructor from a constructor. (REASON: refer to PTR-2)
*/	  