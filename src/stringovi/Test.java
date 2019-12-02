
package stringovi;

import java.util.Iterator;


public class Test {
    public static void main(String[] args) {
       
        char[] array = {'T', 'h', 'i', 's', 'i', 's', 's', 't', 'r', 'i', 'n', 'g'};
        //prebacivanje niza karaktera u String
        String message = new String(array);
        System.out.println(message);
        
        //prebacivanje String-a u niz karaktera
        char[] newArray = message.toCharArray();
        System.out.println(newArray);
        
        //ili koristenjem petlje
        for (char c : newArray) {
            System.out.println(c);
        }
        
        //broj karaktera u Stringu pomocu metode length()
        System.out.println(message.length());
        
        //konvertovanje u velika slova toUpperCase()
        System.out.println(message.toUpperCase());
        
        //konvertovanje u mala slova toLowerCase()
        String tekst = "OVO SU VELIKA SLOVA";
        System.out.println(tekst.toLowerCase());
        
        //odsijecanje praznih karaktera sa pocetka i kraja Stringa metodom trim()
        String tekst1 = "  ovo je neki tekst    ";
        System.out.println(tekst1.trim());
        
        //utvrdjivanje karatera stringa ili podstringa u Stringu metodom indexOf()
        String str1 = "Welcome to ITAcademy";
        String str2 = "ITAcademy";
        /*ako postoji karakter, bice vracen njegov invdex (ako ga nema, vratice se -1)
          ako postoji vise karaktera, vratice se broj prvog indeksa*/
        System.out.println(str1.indexOf("o"));
        
        //drugim parametrom odredjujemo od kojeg indeksa pocinje pretraga
        System.out.println(str1.indexOf("o", 5));
        
        //index prvog karaktera proslijedjenog Stringa
        System.out.println(str1.indexOf(str2));
        
        //koji se karakter nalazi na odredjenoj poziciji u String-u metodom charAt()
        System.out.println(str1.charAt(6));
        
        /*izvlacenje podstringova jednog Stringa metodom subString()
          samo sa pocetnim indexom*/
        System.out.println(str1.substring(11));
        
        /*izvlacenje podstringova jednog Stringa metodom subString()
          sa pocetnim i krajnjim indexom*/
        System.out.println(str1.substring(11, 14));
        
        /*uporedba dva Stringa sa == (uporedjuje samo adrese, a ne i vrijednosti*/
        String str3 = "First value";
        String str4 = "First value"; //pokazuju na istu adresu, pa su iste
        System.out.println(str3 == str4);
        
         /*uporedba dva Stringa metodom equals() koja se preporucuje*/
        String str5 = "First value";
        String str6 = new String("First value"); //ovo je objekat, pa su adrese razlicite
        System.out.println(str5 == str6); //vraca FALSE
        System.out.println(str5.equals(str6)); //vraca TRUE
        
        /*da li string zapocinje na odredjeni nacin metodom startsWith()*/
        String text1 = "Welcome to ITAcademy!";
        System.out.println(text1.startsWith("Welcome")); //vraca TRUE
        /*da kli String zapocinje ali od odredjenog indexa*/
        System.out.println(text1.startsWith("ITAcademy", 11)); //vraca TRUE
        
        /*da li string zavrsava na odredjeni nacin metodom endsWith()*/
        System.out.println(text1.endsWith("ITAcademy!")); 
        
        //zamjena karaktera u Stringu metodom replace()
        String text2 = "------Welcome to ITAcademy------";
        System.out.println(text2.replace("-", "*"));
        
        /*dijeljenje niza na niz podstringova na mjestima gdje se pojavljuje karater
         "-" upotrebom metode split() upotrebom jednog kriterija*/
        String text3 = "Welcome-to-ITAcademy";
        
        String[] wordArray = text3.split("-");
        for (String string : wordArray) {
            System.out.println(string);
        }
        
        /*dijeljenje niza na niz podstringova upotrebom metode split() i upotrebom 
        više kriterija*/
        String text4 = "This is sentece.    This is a question, right? Yes!    It is.";
        
        String[] wordArray1 = text4.split("[ .,?!]+"); //kriteriji u uglastim zagradama
                                                       //+ podrazumijeva kriterij koji se 
                                                       //vise puta ponavlja 
        for (String string : wordArray1) {
            System.out.println(string);
        }
    }
}
