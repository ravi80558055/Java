class Demo2_1{
	public static void main(String...s){
		//System.out.println(6-2+"hi"+4-2);          //4hi4-2       //prints: Error
		//System.out.println(6/2+"hi"+4*2);          //3hi8 	   	//prints: 3hi8
		//System.out.println(4%2*5/4+"hell"+4-2+5);  //0hell4-25    //prints: Error
		
		System.out.println(6-2+"hi"+(4-2));          //4hi2			//prints: 4hi2	
	    System.out.println(6/2+"hi"+4*2);            //3hi8			//prints: 3hi8	
        System.out.println(4%2*5/4+"hell"+(4-2+5));  //0hell7		//prints: 0hell7
		
		int a=2, b=4;
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b)+".");
	}
}		

//Concatenation is done on line 12, using string and variables. This is how we use variables in println function