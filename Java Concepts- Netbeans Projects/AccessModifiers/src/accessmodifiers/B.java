package accessmodifiers;

public class B {
    public void m2(){
        System.out.println("Hello This is B.");
        p1.A a1 = new p1.A();
        System.out.println(a1.x);
        //System.out.println(a1.y);
        //System.out.println(a1.z);
        //System.out.println(a1.h);     //CTError: h is having private access
    }
}
