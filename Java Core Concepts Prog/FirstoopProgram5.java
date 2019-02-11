//Problem Statement (WHY TO USE?): Can we run lines of code while keeping main block empty?

/* WHEN TO USE?
--> If we want to run any code(like conn. establishment, etc.) before the main method, then we use this block.
*/

class Static_block{
	static{
		System.out.println("Static blocks loads just as the class loads and before main method");
	}
	public static void main(String...s){
		//empty
		
		/* static{
		System.out.println("Static blocks loads just as the class loads and before main method");
		} */
		
		employee a = new employee();
		employee b = new employee();
		/* two instances of class employee are created. So, does that means static block will run 2 times?
		---> NO.
		*/
		
		a.input("asd",12345);
		b.input("qwe",12345);
		
		a.output();
		b.output();
	}
}

//Blueprint of Employee
class employee{
	static{
		System.out.println("cvb");		
	}
	private String name;             
	private int salary;              
	static private String c_name;
	
	static void co(String c){
		c_name = c;
	}

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


//PTR:- any static block will execute just once during the program execution or say in it's lifetime.
//		for ref. go through this code and run it.
