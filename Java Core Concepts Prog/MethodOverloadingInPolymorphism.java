/* AIM: to understand the concept of method overloading or POLYMORPHISM(Compile-time)
PROBLEM STATEMENT: If we have 100+ methods in our class, so to use them via obj. reference we must remember
the names and type of arguments they hold.(eg. m1,m2,m3,m4,m5,...with respective arguments)

-->SOLUTION: Instead we can name all the functions with same name, and just pass the arguments to run it.
			 This is also known as METHOD OVERLOADING.
 */
 
//Condition for Method Overriding: Name must be same. 

class Add{
	//void m1(int a,int b){
	void add(int a,int b){
		System.out.println("Sum: "+(a+b));
	}
	//void m2(double a,double b){	
	void add(double a,double b){  
		System.out.println("Sum: "+(a+b));
	}
	//void m3(int a,double b){
	void add(int a,double b){     
		System.out.println("Sum: "+(a+b));
	}  
	//void m4(double a,int b){
	void add(double a,int b){      
		System.out.println("Sum: "+(a+b));
	}  
	//void m5(String a,String b){
	void add(String a,String b){    
		System.out.println("Sum: "+(a+b));
	}
}

class Method_overloading_POLYMORPHISM{
	public static void main(String args[]){
		Add x = new Add();
		x.add("Hi","Ravi");
		x.add(3.14,9.56);
		x.add(2.4,5);
		x.add(4,3);
		x.add(6,8.24);
	}
}

/* 
POLYMORPHISM:- It can undrstand as method overloading, means multiple methods with same name.
			 - Same name but having different functionalities.
			 - (All verbs in English like play, fly, etc... shows polymorphism.)
*/

/*
METHOD-OVERLOADING:- Not using inherited component(method here), instead making your own(method).
                   - Due to overloading, inherited method will not alloted memory, instead memory will be
				     alloted to new method that you have created.
					 
PTR: this type of polymorphism is also known as 'Compile-time Polymorphism'.
 */