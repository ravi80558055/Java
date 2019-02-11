class type_casting{
	static public void main(String...s){
		byte a=10;                          //Implicit type-casting or down-casting or widening
		double b=a;                         //Implicit type-casting or down-casting or widening
		System.out.println(b);              //Implicit type-casting or down-casting or widening
	
		int c=(byte)10;                     //Explicit type-casting or Up-casting or narrowing
		System.out.println(c);              //Explicit type-casting or Up-casting or narrowing
		
		long x=3, y=4, z=x+y;
		System.out.println(z);
		
		//special case of type-casting --->		float <--> int
		int p=10;
		float q=p;
		System.out.println(q);
		
		float r=15.0f;                       //float declaration: float var_name = <f-p_literal>f 
		System.out.println(r);               //'f' is added in last to make var float otherwise 
                                             //by default it will be of type double
		int w = (int)r;
		System.out.println(w);
		
		/* char ab = 'ba';
		int k=ab;
		System.out.ptintln(k); */
	}
}

/* 
Implicit type-casting                           Explicit type-casting
- down-casting or widening                      - up-casting or narrowing
- no data loss                                  - data loss is an issue
- lower-size data-type to                       - higher-size data-type to
  higher-size data-type.                          lower-size data-type.
- Example is shown above.                       - Example is shown above. 
*/


/* 
PTR: - byte + byte != byte (but can be of any higher integer-literal)
	 - short + short != short (but can be of any higher integer-literal)
	 - int + int = int (or can be of any higher integer-literal)
	 - long + long = long (or can be of any higher integer-literal)
*/