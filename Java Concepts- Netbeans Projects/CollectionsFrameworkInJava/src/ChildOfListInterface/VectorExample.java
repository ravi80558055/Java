package ChildOfListInterface;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Ravi");
        v.add(8055);
        v.add('m');
        
        System.out.println(v);
        v.removeElement('m');
        System.out.println(v);
        
        //for Iterator, all the data in the collection, should be of same type.
        Vector v1 = new Vector();
        v1.add(4);
        v1.add(0);
        v1.add(-10);
        v1.add(6);
        v1.add(-1);
        v1.add(5);
        v1.add(3);
        
        for(int x = 0; x < v1.size(); x++){
            System.out.print(x+" ");
        }
        
        //Iterator class is abstract, hence it cannot be instantiated.
        //Iterator i = new Iterator();
        Iterator i = v1.iterator();
        
        while(i.hasNext()){
            System.out.println(v1);
            
        }
        int z = (Integer)i.next();
            if(z < 0){
                i.remove();
            }
            System.out.println(v1);
    }
}
