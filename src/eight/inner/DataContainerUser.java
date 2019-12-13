
package eight.inner;

import java.util.ArrayList;


public class DataContainerUser {
    public static void main(String[] args) {
        
        //objektni neparametrizirani tip lista - raw tip (sirovi tip)
        ArrayList lista = new ArrayList(); 
        
        //parametrizirani objektni tip lista
        ArrayList<String> lista1 = new ArrayList<>();
        
        NumberContainer dataContainer = new NumberContainer();
        for (Integer number : dataContainer) {
            System.out.println(number);
        }
    }
}
 