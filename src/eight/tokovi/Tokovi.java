
package eight.tokovi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Tokovi {
    public static void main(String[] args) {
        /*
        String myText = "Hello World";
        
        try (FileWriter fw = new FileWriter("myFile.txt")){
            fw.write(myText);
        } catch (IOException e) {
            System.out.println(e);
        }
        */
        
        //citanje iz fajla karakter po karakter
        try (FileReader fr = new FileReader("myFile.txt")){
            int c;
            while ((c = fr.read()) != -1) {                
                System.out.println((char)c);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println();
        }
        
        //citanje liniju po liniju
        try (BufferedReader br = new BufferedReader(new FileReader("myFile.txt"))){
            String line;
            while ((line=br.readLine()) != null) {                
                 System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
