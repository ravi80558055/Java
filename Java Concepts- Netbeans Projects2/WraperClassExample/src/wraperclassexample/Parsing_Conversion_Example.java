package wraperclassexample;

public class Parsing_Conversion_Example {
    public static void main(String[] args) {
        //parsing: string --> int,float,double...
        String s = "105";
        System.out.println(s+5);
        
        int i = Integer.parseInt(s);    //this line converts String to int
        System.out.println(i+5);
        
        
        //conversion: int,float,double... --> String
        int a = 100;
        System.out.println(a+10);
        
        String st = String.valueOf(a);  //this line converts int to String
        System.out.println(st+10);
    }
}
