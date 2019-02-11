package wraperclassexample;

public class Boxing_Unboxing_Autoboxing {
    public static void main(String[] args) {
        int a = 40;
        Integer b = new Integer(a);     //This step is known as Boxing
        b++;    //this was not allowed in earlier vwrsions of jdk(before jdk1.5)
        System.out.println(b);
        
        int c = b.intValue();   //this step is doing Unboxing
        c++;
        System.out.println(c);
        
        int p = 100;
        Integer i = p;  //Autoboxing(we don't have to write 'new' keyword)
        i++;
        System.out.println(i);
        
        int j = i;  //auto-unboxing
        i++;
        System.out.println(i);
    }
}
