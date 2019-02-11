class incre_decre_test{
	static public void main(String...s){
		int a=10;
		//System.out.println(a++);			//10
		//System.out.println(a++);			//11
		//System.out.println(a++);			//12
		//System.out.println(a++);			//13
		
		System.out.println(++a);			//11
		System.out.println(++a);			//12
		System.out.println(++a);			//13
		System.out.println(++a);			//14
		System.out.println(++a);			//15
		System.out.println(a);				//15
	}
}