package LacosDeRepeticao;
import java.util.Scanner;

public class IfElse {

    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Qual foram as notas que voce tirou nos 3 trimestre?");
        int nota1 = s.nextInt();
        int nota2 = s.nextInt();
        int nota3 = s.nextInt();
        int media = (nota1 + nota2 + nota3) / 3;
        String notaFinal = getMedia(media);
        System.out.println(notaFinal);
    }
    public static String getMedia(int media){
        if(media>=7){
            return "Aprovado";
        } else if (media<7 && media>=5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
