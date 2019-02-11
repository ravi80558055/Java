//PROBLEM STATEMENT: WAP to make a class for 1000+ employees of the same company
// --> different employees, same company

/* 
if c_name = "comp" -> 2*4=8 Bytes i.e. for 1000 employees mem. used = 8*1000 = 8000 Bytes
for storing the variable having same value.

So, to overcome this issue we use static keyword which allow us to use static data with every instance
of class, and using only the memory used in declaration of static content.
*/
class Static_keyword{
	public static void main(String...s){
		//emp.c_name = "xyz";
		emp a = new emp(); 
		emp b = new emp();
		emp c = new emp();
		
		a.input("asd",12345);
		b.input("qwe",12345);
		c.input("zcx",12345);
		
		a.output();
		b.output();
		c.output();
	}
}
class emp{
	private String name;             
	private int salary;              
	static private String c_name = "comp";
    //static String c_name;                     //use with line 13 and make line 30 as comment

	public void input(String n, int s){
		name = n;
		salary = s;
	}
	public void output(){
		System.out.println(name);
		System.out.println(salary);
		System.out.println(c_name);
	}
}

/* 
PTR:- Static variable can be accessed by the class name as well (when not private). eg- emp.c_name = "comp";
	  while, non-static (private,public) cannot be accessed by class reference.
	- static member of a class, is a member common to every obj. of that class.
	- memory will be allocated to static member when the class having that member will get loaded in the memory.
*/	