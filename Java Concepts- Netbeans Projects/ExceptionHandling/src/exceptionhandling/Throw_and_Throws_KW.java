package exceptionhandling;

//creating custom(Programmer-defined) Exception
class MyException extends Exception {

    String msg;

    public MyException(String s) {
        msg = s;
    }

    @Override //getMessage  is method of exception class, so we should use override notation
    public String getMessage() {
        return msg;
    }
}

class Student {

    private int age;

    public void setAge(int x) throws MyException {  //use throws when we as a programmer don't want to handle some exceptions, we have created our own custom class and can use it via throws KW with the method having chances of Exception occuring.
        if (x <= 0) {
            throw new MyException("Invalid Age!");
        } else {
            age = x;
        }
    }

    public int getAge() {
        return age;
    }
}

public class Throw_and_Throws_KW {

    public static void main(String[] args) {
        Student s1 = new Student();
        try {
            s1.setAge(-12);
            System.out.println("Age: " + s1.getAge());
        } catch (MyException me) {
            System.out.println(me.getMessage());
        }
        Student s2 = new Student();
        try {
            s2.setAge(20);
            System.out.println("Age: " + s2.getAge());
        } catch (MyException me) {
            System.out.println(me.getMessage());
        }
    }
}
