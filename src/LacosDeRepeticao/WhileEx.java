package LacosDeRepeticao;
import java.util.Scanner;

public class WhileEx {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Voce deseja a tabuada de algum numero?");
        String resposta = s.next();

        while(resposta.equalsIgnoreCase( "Sim")){
            System.out.println("Digite um numero para gerar a tabuada:");
            int num = s.nextInt();
            for (int i=0; i<=10; i++){
                System.out.println(num + " X " + i + " = " + num*i);
            }
            System.out.println("Voce deseja a tabuada de outro numero?");
            resposta = s.next();
        }

    }
}
