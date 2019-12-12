
package nine.reference;

// 1. Strong reference

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

// 2. Weak reference
// 3. Soft reference
// 4. Phantom reference

public class ReferenceEcecutor {
    public static void main(String[] args) {
        Person p1 = new Person(); //Strong reference
        p1.setName("Mirzad");
        
        System.out.println(p1.toString());
        
        WeakReference<Person> weakReferenceOfp1 = new WeakReference<>(p1); //Weak reference
        System.out.println(weakReferenceOfp1.get());
        System.gc(); // garbage collector
        System.out.println(weakReferenceOfp1.get());
        
        SoftReference<Person> softReference = new SoftReference<>(p1); //Soft reference
        //PhantomReference<Person> phantomReference = new PhantomReference<>(p1); 
    }
    
}
