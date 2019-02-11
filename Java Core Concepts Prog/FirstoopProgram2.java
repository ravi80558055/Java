//Problem Statement: We have to design a program which will keep records of emloyees (can be of different company.)
//Effective because we are providing functionalities to data/obj. of the class using functions. 
//performing TIGHT ENCAPSULATION to secure data of blueprint.

//USING private and public keywords.

class First_OOP_Program2{
	public static void main(String...ar){
		Emp a = new Emp(); 
		Emp b = new Emp();
		Emp c = new Emp();
		
		a.input("asd",12345,"poiu");
		b.input("qwe",12345,"lkj");
		c.input("zcx",12345,"mnb");
		
		//a.name="qwerty";		//run fine if 'name' is non-static variable else give CTError
		a.output();
		b.output();
		c.output();
	}
}
class Emp{                   
	private String name;             
	private int salary;              
	private String c_name;     

	public void input(String n, int s, String c){
		name = n;
		salary = s;
		c_name = c;
	}
	public void output(){
		System.out.println(name);
		System.out.println(salary);
		System.out.println(c_name);
	}
	/* 
	void test(int j,int k)                       //CTError
		System.out.println("Sum= "+(j+k));       //CTError
	 */                                          //CTError
}	
//functions are known as methods as they must be kept inside a block otherwise result in CTError

/* 
private
- this keyword allows a var/method/class accessible only inside the class in which they are declared.
- cannot be accessed by any other var/function/class.

public
- this keyword allows a var/method/class accessible anywhere inside a program.
 */