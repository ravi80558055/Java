package p1;
import p1.p2.B;     //importing class B from package p1.p2 (here p2 is sub-package in p1)

public class A {
    public int x = 9;
    public void m1(){
        System.out.println("Hello this is class a in package p1");
        B b = new B();
        b.m2();
        System.out.println(b.y);
    }
    public static int z = 8;
    public static void m4(){
        System.out.println("Hiiii...");
    }
}
