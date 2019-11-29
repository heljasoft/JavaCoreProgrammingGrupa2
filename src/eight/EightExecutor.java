
package eight;

import eight.enumeration.Day;
import eight.enumeration.Gender;
import eight.enumeration.Season;


public class EightExecutor {
    public static void main(String[] args) {
        Season s = Season.FALL;
        
        Day day = new Day(Season.FALL);
        Day day1 = new Day(Season.SPRING);
        System.out.println(day.getSeason().getName());
        System.out.println(day1.getSeason().getName());
    }
    
    static void printGender(Gender gender){
        switch(gender){
            case MALE:
                System.out.println("Ja sam muskarac");
                break;
            case FEMALE:
                System.out.println("I am a lady");
                break;
            case TRANS:
                System.out.println("Ne znam sta sam");
                break;
            default:
                System.out.println("Unknown gender");
                break;
        }
    }
}
