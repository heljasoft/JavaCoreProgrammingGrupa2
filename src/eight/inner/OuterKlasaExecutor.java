
package eight.inner;


public class OuterKlasaExecutor {
    public static void main(String[] args) {
        
        OuterKlasa.StaticNestedKlasa objekatStatickeKlase = new OuterKlasa.StaticNestedKlasa();
        
        OuterKlasa outerKlasaObjekat = new OuterKlasa();
        OuterKlasa.InnerKlasa innerClassObjekat = outerKlasaObjekat .new InnerKlasa();
    }
}
