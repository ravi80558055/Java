//A class have 6 types of members.

class Class_Summary{
/* member 1 */	static{
					System.out.println("Summary of the members a classs can hold:-");
				}
/* member 2 */	{
					System.out.println("This is a member: initialize block.");
				}
/* member 3 */	Class_Summary(){
					System.out.println("This is a member: Constructor.");
				}
/* member 4 */	int var = 8055;
/* member 5 */	public void method(){
					System.out.println("Data member of this class having value = "+var+" can only be accessed via method.");
				}
/* member 6 */	class Nested_class{
					int local_var = 5508;
					public void local_method_block(){
						System.out.println("Data member(local variable) of this class having value = "+local_var+" can be directly accessed via local method in this local block only, For accessing outside this local block, instantiation is the only way.");
					}
				}
}
//First way of using a class in another class: Inheritance
class child extends Class_Summary{
	public void function(){
		System.out.println(var);
		System.out.println("We can only declare in class block, rest all(calling and acessing) is meant to be done in local blocks.");
	}
}