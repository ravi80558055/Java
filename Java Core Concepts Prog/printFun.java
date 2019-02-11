class Demo1{
	static public void main(String...s){
		int a=2,b=5,r=a+b;
		System.out.print(r+"\n");        //Types of printing function in java.
		System.out.println(r);           //Types of printing function in java.
		System.out.printf("%d\n",r);     //Types of printing function in java.
		
		double c=1.2343;
		System.out.println(c); //prints: 1.2324          //Difference between printf and println function
		System.out.printf("%f",c); //prints: 1.232400    //Difference between printf and println function
	}
}

//printf:- a programmer can format data and print it in the formated form.
//
//		 - For example: In line 10, System.out.printf("%.2f",c);  will print upto two decimal places 
//		   i.e. formatted data.
//
//		 - This cannot be achieved with the help of 'println' function.
//
//		 - printf is format specifier based (that's why line 10 prints two 0s extra) while, 
//		   println is expression based (that's why it prints the exact expression/data).
//
//		 - printf uses ','(comma) whereas, println don't uses ','. 
