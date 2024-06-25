package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args){
       exemploAlfaNumericos();
       exemploNumericos();

    }

    private static void exemploNumericos() {
        Set<Integer> exemplo = new TreeSet<>();
        System.out.println("*****Exemplo com Alfanuméricos");
        exemplo.add(10);
        exemplo.add(30);
        exemplo.add(5);
        exemplo.add(15);
        System.out.println(exemplo);

    }

    private static void exemploAlfaNumericos() {
        Set<String> exemplo = new TreeSet<>();
        System.out.println("*****Exemplo com Alfanuméricos");
        exemplo.add("Roger");
        exemplo.add("Cleber");
        exemplo.add("Fabiano");
        exemplo.add("Adriano");
        System.out.println(exemplo);
    }

}
