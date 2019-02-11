//Problem Statement: We have to design a program which will keep records of emloyees (can be of different company.)
//Effective because we are providing functionalities to data/obj. of the class using functions. 
class First_OOP_Program1{
	public static void main(String...ar){
		Emp a = new Emp(); 
		Emp b = new Emp();
		Emp c = new Emp();
		
		/*giving values for each instances
		a.name = "asd";
		a.salary = 12345;
		a.c_name = "poiu";
		b.name = "qwe";
		b.salary = 12345;
		b.c_name = "lkj";
		c.name = "zcx";
		c.salary = 12345;
		c.c_name = "mnb";
		
		printing values to screen
		System.out.println(a);	
		System.out.println(a.name);
		System.out.println(a.salary);
		System.out.println(a.c_name+"\n");
		System.out.println(b);
		System.out.println(b.name);
		System.out.println(b.salary);
		System.out.println(b.c_name+"\n");
		System.out.println(c);
		System.out.println(c.name);
		System.out.println(c.salary);
		System.out.println(c.c_name);
		*/
		/* 
		a.input("asd",12345,"poiu"); is equivalent to a.name = "asd";     these three lines of code
		                                              a.salary = 12345;
		                                              a.c_name = "poiu";
		 */
		a.input("asd",12345,"poiu");
		b.input("qwe",12345,"lkj");
		c.input("zcx",12345,"mnb");
		
		/* 
		a.output(); is equivalent to System.out.println(a.name);       these three lines of code
									 System.out.println(a.salary);
									 System.out.println(a.c_name);
		 */
		a.output();
		b.output();
		c.output();
	}
}
class Emp{                   
	String name;             
	int salary;              
	String c_name;     

	void input(String n, int s, String c){
		name = n;
		salary = s;
		c_name = c;
	}
	void output(){
		System.out.println(name);
		System.out.println(salary);
		System.out.println(c_name);
	}
	/* 
	we can have both functions in a single function to reduce more lines of code resulting in just a 
	single call of the function to get input and show output.
	but to just make everything clear we have used two different functions and not making it complex by merging
	the two functionalities in one.
	*/
}    

/* 
- Number of lines in a code can be reduced just by adding functionalities to the operable data using functions.
- Hence, functions are methods which provide functionalities to the data in a class.
*/

/* 
Still it is not the optimal way, because variables of Emp class can be changed in main class by declaration mtd..
So, to avoid this, use private keyword in front of the variables of 'Blueprint'
Loo for First_OOP_Program2 to see in action.
*/

