package collections.set;
import java.util.Set;
import java.util.HashSet;

public class ExemploHashSet {

    public static void main(String[] args){
        Set<String> nomes = new HashSet<>();
        nomes.add("Elias");
        nomes.add("Roberto");
        nomes.add("Marcelo");
        System.out.println(nomes);
        nomes.add("Roberto");
        System.out.println(nomes);
    }
}
