package exceptionhandling;

public class MultipleExceptionsSingleCatch {
    public static void main(String[] args) {
        System.out.println("Hellooo...");
        int a = 15, b = 0, c = 3, r = 0, x[] = {2, 4, 5, 8, 4, 7};
        try {
            //r = a / b; //this will catch an EXCEPTION
            r = a / c;  //this will catch an EXCEPTION
            System.out.println("Division: " + r);
            System.out.println("Hiiiii....");
            System.out.println(x[20]);
        }
        
        //as we know a parent can hold a child, same here, Exceeption is parent of everyreported exception(ref. notes.)
        
        catch (Exception e) {     //by using single catch to handle multiple exceptions, we have to compromise eith the output when an exception occured.
            System.out.println("Exception occured!:  "+e.getMessage());
            System.out.println(e);  //it will print what type of has exception occured along with the package.
            //e.printStackTrace();  //it does the same as line 15, but in more detail manner.
        }
        r = a + b;
        System.out.println("sum: " + r);
        System.out.println("Byeeee......");
    }
}
