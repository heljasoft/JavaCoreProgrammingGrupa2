
package eight.inner;

import java.util.Iterator;

//Generički tip na nivou klase ili interfejsa
//1. E, T, S, U, V Unbounded generic type
public class NumberContainer<E extends Number> implements Iterable<Integer>{
    private final static int SIZE = 15;
    private Integer[] numbers = new Integer[SIZE];

    public NumberContainer() {
        //napuniti svoj kontejner sa vrijednostima jednakim indeksima
        for (int i = 0; i < SIZE; i++) {
            numbers[i]=i;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
    
    private class ParniInterator implements Iterator<Integer>{

        private int nextIndex = 0;
        
        @Override
        public boolean hasNext() {
            return (nextIndex<SIZE);
        }

        @Override
        public Integer next() {
            Integer value = numbers[nextIndex];
            nextIndex = nextIndex+2;
            return value;
        }
        
        
    }
}
