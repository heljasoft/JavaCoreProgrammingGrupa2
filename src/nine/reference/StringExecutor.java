
package nine.reference;


public class StringExecutor {
    public static void main(String[] args) {
        String name = new String("Amar");
        String name1 = new String("Marko").intern();
        String name2 = "Marko";
        
        System.out.println(name1 == name2);
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        
        System.out.println(name1.equals(name2));
        
        String names = "Ferida Kanita Rijad Fadil";
        //split(String regex)
        String[] niz = names.split(" ");
        for (String string : niz) {
            System.out.println(string);
        }
    }
}
