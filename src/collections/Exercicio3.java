package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args){
        separar();
    }

    private static void separar(){
        List<String> mulheres = new ArrayList<>();
        List<String> homens = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Quantas pessoas tem para adicionar?");
        int qntd = s.nextInt();

        for(int i = 0; i < qntd; i++){
        System.out.println("Digite o nome e o sexo da pessoa separados por ,");
        String pessoaSexo = s.next();
        String[] pessoa = pessoaSexo.split(",");
        if(pessoa[1].equalsIgnoreCase("F")){
            mulheres.add(pessoa[0]);
        } else {
            homens.add(pessoa[0]);
        }
        }
        System.out.println("as mulheres são: " + mulheres);
        System.out.println("os homens são: " + homens);
        }

}


