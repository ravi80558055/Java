//AIM: To understand the concept and use of Anonymous class

/* 
WHY TO USE?: If we have to use something just once, then why give to assign it a name? We can directly declare it.
			MAIN REASON: Instant method overriding of a particular class.
			(Means, if we don't want to create more than one object of a class, or a class is not going
			to be used more than once, then make that class anonymous.)

WHAT DOES IT MEAN BY MAKING A CLASS ANONYMOUS?
--> class without any name.
--> this class will execute during instantiation of the class, and can never be used again after that.
--> Difference is shown in the program between normal instantiation and anonymous instantiation.

*/
class Anonymous_parent{
	public void m1(){
		System.out.println("Hello Anonymous_parent");
	}
}
/* Normal class
class Anonymous_class{
	public static void main(String[] args){
		class Anonymous_child extends Anonymous_parent{
			public void m1(){
				System.out.println("Hello Anonymous_child");
			}
		}
		Anonymous_parent a = new Anonymous_child();  //binding hui Anonymous_parent se, but execute reference(Anonymous_child) se karta hai
		a.m1();
	}
}
*/
class Anonymous_class{
	public static void main(String[] args){
		Anonymous_parent a = new Anonymous_parent(){           //Anonymous Class
			public void m1(){                                  //Anonymous Class
				System.out.println("Hello Anonymous_child");   //Anonymous Class
			}                                                  //Anonymous Class
		};
		a.m1();
	}
}
