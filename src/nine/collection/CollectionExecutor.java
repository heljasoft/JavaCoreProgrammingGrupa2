
package nine.collection;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionExecutor {
    public static void main(String[] args) {
        String names = "Amar Hodzic;Rijad Dautovic;Rijad Rogo";
        String[] arrayOfNames = names.split(";");
        for (String arrayOfName : arrayOfNames) {
            System.out.println(arrayOfName);
        }
        
        Collection<String> iterableObject = new ArrayList<>();
        for (String arrayOfName : arrayOfNames) {
            iterableObject.add(arrayOfName);
        }
        
        System.out.println("Printamo iterable object");
        for (String name : iterableObject) {
            System.out.println(name);
        }
    }
}
