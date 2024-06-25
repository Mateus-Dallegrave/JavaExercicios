package collections.list;

import collections.domain.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args){

        List<Carro> tabela = new ArrayList<Carro>();
        Carro a = new Carro("Uno","Fiat", "1.0", 15000);
        Carro b = new Carro("Clio","Renault", "1.0", 20000);
        Carro c = new Carro("Onix","Chevrolet", "1.0", 35000);
        tabela.add(a);
        tabela.add(b);
        tabela.add(c);
        System.out.println(tabela);
        Collections.sort(tabela);
        System.out.println(tabela);

        ComparaPrecoCarro comparaPrecoCarro = new ComparaPrecoCarro();
        Collections.sort(tabela, comparaPrecoCarro);
        System.out.println(tabela);

    }
}

