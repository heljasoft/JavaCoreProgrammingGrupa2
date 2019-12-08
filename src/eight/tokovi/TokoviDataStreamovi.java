
package eight.tokovi;

import java.io.*;



public class TokoviDataStreamovi {
    public static void main(String[] args) {
        /*
        int variableA = 13;
        double variableB = 13.13;
        String variableC = "Hello!";
        
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("myFile1.txt"))){
            out.writeInt(variableA);
            out.writeDouble(variableB);
            out.writeUTF(variableC);
        } catch (IOException e) {
            System.out.println(e);
        }
        */
        //citanje iz fajla
        try (DataInputStream in = new DataInputStream(new FileInputStream("myFile1.txt"))){
            System.out.println(in.readInt());
            System.out.println(in.readDouble());
            System.out.println(in.readUTF());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
