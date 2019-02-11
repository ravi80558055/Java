package multithreading;

//declaration of a thread using Runnable interface
class A implements Runnable {

    @Override
    public void run() {
        for (int x = 0; x <= 100; x++) {
            System.out.println("A " + x);
        }
    }

}

//declaration of a thread using Thread class (Thread class is child of Runnable Interface)
class B extends Thread {

    @Override
    public void run() {
        for (int x = 0; x <= 100; x++) {
            System.out.println("B " + x);
        }
    }

}

//NOTE: If we call the run method from the class's objecting without inheriting it, then it;s not thread; it's simple association way of calling a method.
//      JVM will not treat any class as a thread until it becomes child of a Rinnable intrface or Thread class and then only it executes the thread along with main class
public class MultiThreadingEx {

    public static void main(String[] args) {
        //main class(this class) is itself a thread, JVM first ececutes it's first line and always prints: Hello, rest all the switching happens after it on thread's creation
        System.out.println("Hello");
    //Creation of thread in two steps when implementing Runnable interface    
        A a = new A();
        Thread t1 = new Thread(a);
    //starting a thread
        t1.start();
        
        System.out.println("Hiiiiiiiiiiiii");
        
    //Creation of a thread in a single step while extending Thread class
        B b = new B();
    //Starting a thread    
        b.start();
        System.out.println("Byeee!");
    }
}
