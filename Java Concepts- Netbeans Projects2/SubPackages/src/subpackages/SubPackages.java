package subpackages;

//import KW is used to import the packages having BC of source java file, to use it in the program.
//WHY TO USE?: if we dont use import then we have to write the package name every time we create an obj. of a class of other package.
//PTR: If 2 BCs having same name and are in different packages, we cannot import it, bcoz JVM wont recognize that obj of which class are we refering to.
import p1.A;
import p1.p2.B;     //to access a BC in a sub-package, we have to write the complete package name.
import static p1.A.*;       //(*)asterisk will load all the members having static keyword.
//line 4 is equivalent to : import static p1.A.z; and import static p1.A.m4;

public class SubPackages {
    public static void main(String[] args) {
        m4();
        System.out.println(z);
        System.out.println("Hello this is sub-packages class.");
        //p1.A a = new p1.A();
        A a = new A();
        a.m1();
        System.out.println(a.x);
        //p1.p2.B b = new p1.p2.B();
        B b = new B();
        b.m2();
        System.out.println(b.y);
    }
    
}
