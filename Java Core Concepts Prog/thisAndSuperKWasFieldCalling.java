/* AIM: how to use this & super KW as field calling

WHEN TO USE: If we have same name variable as a class as well as function member and we want to access the 
			 class's variable then we use 'this.mem_name'.
			 And If we have same name variable as inherited class's as well as function's member and we want to access the 
			 super class's variable then we use 'super.mem_name'.
*/

class Test{
	{
		System.out.println("qwertyuiop");		//initialize block
	}
	int x = 10;
	void m(){
		int x = 100;
		System.out.println(x);
		System.out.println(this.x);
	}
	Test(){
		System.out.println("asdfghjkl");
	}
}
class Test1 extends Test{
	int x = 1000;
	void m1(){
		System.out.println(x);
		System.out.println(this.x);
		//System.out.println(super.x);
	}
}
class _this_and_super_KW_as_field_calling{	
	static public void main(String[] args){
		Test t = new Test();
		Test1 t1 = new Test1();//calls it's own def. constructor which calls the constructor of super-class bcoz of by def. super() KW added by JVM.
		System.out.println(t.x);
		t.m();
		System.out.println(t.x);
		System.out.println(t1.x);
	}
}

//PTR: By def. a super CCS is added by JVM, which calls the def.constructor of super-class.