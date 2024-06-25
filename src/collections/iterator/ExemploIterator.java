package collections.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterator {

    public static void main(String args[]) {
        List<String> lista = new ArrayList<String>();
        lista.add("lilas");
        lista.add("amarelo");
        lista.add("roxo");

        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}