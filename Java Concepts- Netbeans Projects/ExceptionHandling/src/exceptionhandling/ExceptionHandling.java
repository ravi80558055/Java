package exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 15, b = 0, c = 3, r = 0, x[] = {2,4,5,8,4,7};
       // r = a/b;      //Arithmetic exception occurs: divide(/) by zero
        try{
            //r = a/c;  //prints: 5
            r = a/b; //this will catch an EXCEPTION
            System.out.println("Division: "+r);
        }catch(ArithmeticException ae){
            System.out.println("Division: "+"oops! denomenator cannot be 0!");
        }
        //System.out.println("Division: "+r); //dependent code, so put it in try block with its independent code.
        System.out.println("Hiiiii....");
        try{
            System.out.println(x[20]);
        }catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("oops! entered index is out of range of array");
        }
        r = a+b;
        System.out.println("sum: "+r);
        System.out.println("Byeeee......");
    }
}
