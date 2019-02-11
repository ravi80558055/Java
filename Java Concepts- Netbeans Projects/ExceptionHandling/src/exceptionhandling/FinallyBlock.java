package exceptionhandling;

public class FinallyBlock {
    
    public static void main(String[] args) {
        
        int a = 15, b = 0, c = 3, r = 0, x[] = {2,4,5,8,4,7};
        try{
            r = a/b;
            System.out.println("Division: "+r);
        }catch(ArithmeticException ae){
            System.out.println("Division: "+"oops! denomenator cannot be 0!");
        }
        System.out.println("Hiiiii....");
        try{
            System.out.println(x[20]);
        }catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("oops! entered index is out of range of array");
        }
        finally{
            System.out.println("Code in final block will execute no matter weather the exception occurs or not.");
        }
        r = a+b;
        System.out.println("sum: "+r);
        System.out.println("Byeeee......");
    }
}
