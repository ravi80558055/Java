//AIM: To understand concept and use of local class in java.

//Every class inside a LOCAL BLOCK is local class, every block EXCEPT NESTED-CLASS is Local(eg.- initialize block, static block, constructor, if-else, do, while, etc...)

//WHY TO USE?: Local class enhance security(declared inside a block, and its instance will be created and deleted wrt the member of the class block),
//			 and is memory efficient(after declaration, if we instantiate this class, then object will be deleted from memory as the reference gets deleted.).

class Class{
	private int x = 10;
	private static int y = 20;
	void m1(){
		//Local_class l = new Local_class();    //CTError: In local block code executes sequentially.
		class Local_class{
			//static int z = 30;	//CTError: we cannot declare static in local class.
			int z = 30;
			void m2(){
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
			}
		}
		Local_class l = new Local_class();   //Local class can only be instantiate in it's own block.
		l.m2();
		System.out.println(l.z);    //Local variable can only be accessed via obj. reference of Local Class.
	}
	void m3(){
		//Local_class l = new Local_class();   //CTError: Local class cannot be instantiate outside it's block.
	}
}
class Local_main{
	public static void main(String[] args){
		//Local_class l = new Local_class();    //CTError: We cannot instantiate local class directly,
								//bcoz it's in local block(method block) which must be called in order 
								//to create instance of Local class.
		
		Class c = new Class();
		
		//Class.Local_class lc = c.new Class();         //CTError: Statement wrong hai(shayad)
		
		//Class.Local_class lc = new Class.Local_class();    //CTError:(KYU?)
		
		//Class.Local_class lc = new Class.Local_class();  //CTError
		lc.m1();
		c.m1();
	}
}