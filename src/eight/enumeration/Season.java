
package eight.enumeration;

//enumerated - pobrojano mnogo objekata
public enum Season {
    
    WINTER("Winter", 1),
    SPRING("Spring", 2),
    SUMMER("Summer", 3),
    FALL("Fall", 4);
    
    //polja, properties
    private String name;
    private int sequence;
    
    //konstruktor je PRIVATE

    private Season(String name, int sequence) {
        this.name = name;
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }
    
    
}
