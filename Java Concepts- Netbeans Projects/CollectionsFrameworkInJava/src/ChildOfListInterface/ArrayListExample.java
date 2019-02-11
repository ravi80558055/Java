package ChildOfListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Ram");
        al.add("10");
        al.add(15);
        //.add() method taes argument of Object type ,so it can hold every type of data...(as Object of parent of every java class).
        
        System.out.println(al);
        System.out.println(al.size());
        al.remove(1);  //this will remove string "10" from ArrayList      //remove() takes index as parameter or the object along with its signature
        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al.get(1));
        
        //if we print the array list object ,we get the whole array printed, all at once...
        //java provides Iterator class having iterator() method, which performs the same task but is mainly used in query operations...to work on loops
        
        ArrayList al2 = new ArrayList();
        al2.add(2);
        al2.add(-1);
        al2.add(15);
        Iterator i = al2.iterator();
        while(i.hasNext()){ //for this we need all the values to be of same data type like int, float,byte, char, string, etc...
            int z = (Integer)i.next();  //next() returns Object type, so to store it in Integer, we need to downcast it...
            if(z>0){
                i.remove();
            }
        }
        System.out.println(al2);
    }
}
