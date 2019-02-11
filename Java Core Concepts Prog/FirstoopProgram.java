//Problem Statement: We have to design a program which will keep records of emloyees (can be of different company.)

class First_OOP_Program{
	public static void main(String...ar){
		Emp a = new Emp(); //Emp type ka ek new var create kiya jiska naam 'a' hai and belongs to 'Emp()' class
		Emp b = new Emp();
		Emp c = new Emp();
		/* 
		.
		.      multiple instances can be made.
		.
		*/
		//giving values for each instances
		a.name = "asd";
		a.salary = 12345;
		a.c_name = "poiu";
		b.name = "qwe";
		b.salary = 12345;
		b.c_name = "lkj";
		c.name = "zcx";
		c.salary = 12345;
		c.c_name = "mnb";
		
		//printing values to screen
		System.out.println(a);	//it will generate an ALPHANUMERIC VLAUE i.e. ref. to the mem. addr. of 'a'
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
	}
}
class Emp{                   //blueprint of Employee via which multiple obj./instances can be created
	String name;             //blueprint of Employee via which multiple obj./instances can be created
	int salary;              //blueprint of Employee via which multiple obj./instances can be created
	String c_name;           //blueprint of Employee via which multiple obj./instances can be created
}                            //blueprint of Employee via which multiple obj./instances can be created

/* 
						A NON-EFFECTIVE APPROACH TO SOLVE THE PROBLEM STATEMENT
this program is leading to more jobs to be done in main method while keeping design(blueprint) simple.
Such can be understood as using a TV by switching wires internally i.e. to change a channel, switch wires, etc.

PTR: all the heavy jobs must be done in the blueprint so as to keep just light weight jobs i.e. utilizing
	in the main method.
	
Note: Look for First_OOP_Program1 to see an more effective way to solve the same problem.	
*/