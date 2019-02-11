class operaters{
	public static void main(String...s){
		byte a=10, b=8;
		//int c=a+b;		//byte + byte cannot be stored in a byte, it then becomes int 
		boolean c,d;                                                                        
		c = ++a <= b-- && a++ != --b;       //11 <= 8            //Logical operaters		
		//byte d = (byte)c;                                      //Logical operaters                         
		System.out.println(c);  //false                          //Logical operaters
		System.out.println(a);	//11                             //Logical operaters
		System.out.println(b);	//7	                             //Logical operaters
		
		byte x;	//as data type is 'byte', then result of the expression must be in range of 'byte' data type.
		x=4<3 ? 10*2/5+10 : 10%2+10*2;							 //Conditional / ternary operator
		System.out.println(x);
		
		//Bitwise operators: these op. work on binary bits of the numbers.
		byte y=10 & 5;	//0
		byte z=10 | 5;	//15
		byte p=10 ^ 5;	//15
		byte q=10 << 1;	//20			//1 is the no. of times we have to left shift 10.
		byte r=10 >> 2;	//				//2 is the no. of times we have to right shift 10.
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
		//0000......10100
	}
}

/* 
Logical AND operator(&&) -> if any of the expression is false, result will be false, and JVM will not evaluate 
							second expression.(i.e. why a=11 and b=7, as second expression is neglected by JVM.)
						 -> when both expressions are true then result will be true.

Logical OR operator(||)  -> if any of the expression is true, result will be true, and JVM will not evaluate
							second expression.
						 -> when both expressions are false then result will be false.	
*/