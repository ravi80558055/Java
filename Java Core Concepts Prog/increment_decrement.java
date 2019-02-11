class unary_operator{
	public static void main(String...a){
		int x=10, y;
		//y=x++;
		//System.out.println(x);
		//System.out.println(y);
		
		//y=++x;
		//System.out.println(x);
		//System.out.println(y);
		
		int z=x++-x+x++;
		System.out.println(x);
		System.out.println(z);
		
		/* System.out.println(4++);
		
		increment_decrement.java:16: error: unexpected type
		System.out.println(4++);
		                   ^
		required: variable
		found:    value
		1 error */
	}
}

//PTR: UNARY OPERATOR or increment/decrement operator works only with variables not with numbers.
//		for eg.- a++  ->  increment value of 'a' by 1
//				but 4++  ->  Shows Error as depicted on line 16-23.