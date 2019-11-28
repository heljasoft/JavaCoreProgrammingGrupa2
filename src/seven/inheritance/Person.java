
package seven.inheritance;


public class Person {
    private static int counter = 0;
    private int age;
    private String name;
    private String surnmae;
    
    public Person(String name, String surname){
        this.name = name;
        this.surnmae = surname;
        counter++;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurnmae() {
        return surnmae;
    }
    
    public static void printCounter(){
        System.out.println("Counter = " + counter);
    }

    @Override
    public String toString() {
        return name + " " + surnmae;
    }
    
    
}
