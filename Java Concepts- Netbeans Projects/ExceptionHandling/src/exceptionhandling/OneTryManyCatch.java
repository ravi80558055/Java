package exceptionhandling;

public class OneTryManyCatch {

    public static void main(String[] args) {
        System.out.println("Hellooo...");
        int a = 15, b = 0, c = 3, r = 0, x[] = {2, 4, 5, 8, 4, 7};
        try {
            r = a / b; //this will catch an EXCEPTION
            System.out.println("Division: " + r);
            System.out.println("Hiiiii....");
            System.out.println(x[20]);
        } catch (ArithmeticException ae) {
            System.out.println("Division: " + "oops! denomenator cannot be 0!");
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("oops! entered index is out of range of array");
        }
        r = a + b;
        System.out.println("sum: " + r);
        System.out.println("Byeeee......");
    }
}

