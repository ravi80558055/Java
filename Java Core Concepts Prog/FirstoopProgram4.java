/* WHY AND WHEN WE USE STATIC KEYWORD WITH A METHOD?
  
--> if we have been asked to change the company name within the main method, we cannot do that if the data(c_name) is static
    and private [we can but we have to change the blueprint, which is not an effective way]
    So, to make this effective we use 'static function'
    making a function static allows us to change the value of static(and private) member of class in main class. 
*/

/* 
PTR:- any method which function over static data, should be static (effictive), but it will also 
	  work fine we don't use static keyword.
	- any method operating non-static (public,private) data must be non-static.
*/

class Static_function{
	static{
		System.out.println("asfdsdsadfsadfasdfasdfa");
	}
	public static void main(String...s){
		employee.co("poiuytrewq");	//if employee (you can also use the ref. var. instead of employee here) is not used, then JVM will get confused that about which instance we are talking.
		employee a = new employee(); 
		employee b = new employee();
		employee c = new employee();
		
		a.input("asd",12345);
		b.input("qwe",12345);
		c.input("zcx",12345);
		
		a.output();
		b.output();
		c.output();
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