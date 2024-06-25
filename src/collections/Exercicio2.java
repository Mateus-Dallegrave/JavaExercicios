package collections;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio2 {
    public static void main(String[] args){
        listaPessoa();
    }

    private static void listaPessoa() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome das pessoas separados por ,");
        String nomesJuntos = s.next();
        String[] nomesSeparados = nomesJuntos.split(",");

        for(int i=0; i<nomesSeparados.length; i++){
            System.out.println(nomesSeparados[i]);
        }
        Set<String> nomes = new TreeSet<>();
        for(int i = 0; i < nomesSeparados.length; i++){
            nomes.add(nomesSeparados[i]);
        }

        System.out.println(nomes);



    }
}
