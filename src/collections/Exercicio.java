package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args){
        List<String> homem = new ArrayList<>();
        List<String> mulher = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Quantas pessoas são?");
        int qnt = s.nextInt();
        for(int i = 0; i < qnt; i++){
            System.out.println("Qual o nome da pessoa?");
            String nome = s.next();
            System.out.println("Qual o sexo da pessoa?");
            String sexo = s.next();
            if (sexo.equalsIgnoreCase("feminino")){
                mulher.add(nome);
            } else {
                homem.add(nome);
            }
        }
        System.out.println("Os homens se chamam" + homem);
        System.out.println("As mulheres se chaman" + mulher);
    }
}
