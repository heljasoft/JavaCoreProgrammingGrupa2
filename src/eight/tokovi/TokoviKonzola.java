
package eight.tokovi;

import java.io.*;


public class TokoviKonzola {
    public static void main(String[] args) {
        
        System.out.println("Enter something here: ");
        
        try (BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in))){
            String s = bufferRead.readLine();
            System.out.println("You entered: "+ s);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
