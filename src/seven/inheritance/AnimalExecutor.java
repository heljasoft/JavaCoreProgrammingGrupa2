
package seven.inheritance;


public class AnimalExecutor {
    public static void main(String[] args) {
        Animal dog = new Dog();
        simulirajKretanjeZivotinje(dog);
        Animal bird = new Bird();
        simulirajKretanjeZivotinje(bird);
    }
    
    static void simulirajKretanjeZivotinje(Animal animal){
        animal.kreciSe();
    }
}
