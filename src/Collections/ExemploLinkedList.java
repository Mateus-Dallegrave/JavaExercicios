package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {

    public static void main(String[] args){
      List<String> lista = new LinkedList<>();
      lista.add("nissan");
      lista.add("ferrari");
      lista.add("lamborghini");
      Collections.sort(lista);
      System.out.println(lista);
      System.out.println("");
      lista.remove(0);
      boolean contem = lista.contains("ferrari");
      System.out.println(contem);

      for (String nome : lista){
          System.out.println(nome);
      }

      System.out.println(lista.get(0));

}
}
