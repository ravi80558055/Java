package variablearguments;

//To use Command-line arguments, we must run the project, not this particular file.
//To pass CLA: properties of project > Run > Arguments = <all the args seperated by space>
public class CLA {
    public static void main(String[] args) {
        System.out.println("Hi...");
        for(String i : args){
            System.out.println(i);
        }
        System.out.println("Bye...");
    }
}
