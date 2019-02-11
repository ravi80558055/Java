/* WHAT IS ANONYMOUS BLOCK AND WHY IT IS USED?
--> It is a block in which we keep that code which we want to execute everytime an obj. gets created.

PROBLEM STATEMENT: we being asked to execute a code 1000+ time an instance is created.

NON-EFFECTIVE WAY: write the code to be repeated in each and every constructor.

EFFECTIVE WAY: Use of anonymous block.
*/

class Anonymous_block_Example{
	public static void main(String...s){
		Initialize_block_Example a = new Initialize_block_Example(5,9);
		Initialize_block_Example b = new Initialize_block_Example();
		Initialize_block_Example c = new Initialize_block_Example(10,15);
		Initialize_block_Example d = new Initialize_block_Example();
	}
}
class Initialize_block_Example{
	{                                                           //anonymous block declaration
		System.out.println("This is an Initialize block");      //anonymous block declaration
	}                                                           //anonymous block declaration
	Initialize_block_Example(int x, int y){
		System.out.println("Sum = "+(x+y)+"\n");
	}
	Initialize_block_Example(){
		System.out.println("Empty constructor!"+"\n");
	}
}