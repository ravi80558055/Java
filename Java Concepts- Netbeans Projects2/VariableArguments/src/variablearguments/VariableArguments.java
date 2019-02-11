package variablearguments;
public class VariableArguments {

    public static void main(String[] args) {
        show(5);
        show();
        show(new int[]{2,3,57,8});
        show(2,7,45,7);
    }
    //static void show(int x){  //normal method
    static void show(int...x){  //method with variable arguments(by applying three dots before variable name)
        //var-args allows a single function to support null, one or more arguments (but they all should be of same type)
        for(int s : x){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
