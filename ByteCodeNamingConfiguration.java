//AIM: To understand how name is assigned to ByteCode(.class file).

class A{               //A.class
	class B{                     //A$B.class
		int x = 10;
		void m1(){
			System.out.println(x);
		}
	}
	void m2(){
		class B{                 //A$1B.class         //1 denotes that class is one level down than class block.
			int y = 20;
			void m21(){
				System.out.println(y);
			}
		}
		class C{                //A$C.class
			int c = 30;
		}
		B b = new B(){                  //A$1.class     //no name is assigned to anonymous class
			//Anonymous Class
		};	//semicolon ';' is optional
	}
	B b1 = new B(){};	//Anonymous class      //A$2.class
	B b2 = new B();
	void m3(){
		class B{                   //A$2B.class       //number increases to 2(because declared earlier as well in same priority block(line 11))
			int p = 40;
		}
		class E{                   //A$1E.class       //1 denotes that class is one level down than class block.
			int q = 50;
		}
	}
}