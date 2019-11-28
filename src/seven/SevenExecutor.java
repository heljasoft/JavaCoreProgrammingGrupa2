
package seven;

import seven.inheritance.Person;
import seven.inheritance.Student;
import seven.inheritance.Teacher;


public class SevenExecutor {
    public static void main(String[] args) {
        Student p = new Student("Sanel", "Helja", 45);
        String result = checkPerson(p);
        System.out.println(result);
        Person p1 = new Teacher("Emir", "Puska", 34);
        result = checkPerson(p1);
        System.out.println(result);
        System.out.println(p.toString());
        System.out.println(p1.toString());
    }
    
    private static String checkPerson(Person p){
        if(p instanceof Student){
            return "Student";
        }else if(p instanceof Teacher){
            return "Teacher";
        }else{
            return "Person";
        }
    }
}
