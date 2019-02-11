package wraperclassexample;
public class WraperClassExample {

    public static void main(String[] args) {
        //wraper class is used to store data in non-primitive form
        int a = 10;
        System.out.println(a);
        
        
        //By using wrapper class we can use predefined functions on the variable
        Integer i = new Integer(20);    //similarly for float, double, etc...
        System.out.println(i.byteValue());
    }
    
}
