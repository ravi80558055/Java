class test_arithmatic_operators{
	public static void main(String...s){
		int a=7/2;
		double b=7/2;   //to get answer in float, atleast one of these should be float.
		double c=7/2.0; 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(-7/2);
		System.out.println(7/-2);
		System.out.println(-7/-2);
		
		System.out.println(7%2);        //remainder takes the sign of numerator (a/b) here 'a' is numerator.
		System.out.println(-7%2);       //remainder takes the sign of numerator (a/b) here 'a' is numerator.
		System.out.println(7%-2);       //remainder takes the sign of numerator (a/b) here 'a' is numerator.
		System.out.println(-7%-2);		//remainder takes the sign of numerator (a/b) here 'a' is numerator.
		
		
	}
}