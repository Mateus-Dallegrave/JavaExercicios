package LacosDeRepeticao;
import java.util.Scanner;

public class SwitchEx {

    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        String animal = "";
        System.out.println("Voce gosta de animais?");
        String reposta = s.next();
        if(reposta.equalsIgnoreCase("Sim")){
            System.out.println("Digite algum animal:");
            animal = s.next();
            System.out.println(tipo(animal));
        }
    }
    public static String tipo(String animal){
        String result;
        switch(animal){
            case "CACHORRO":
            case "GATO":
                result = "É um animal doméstico";
                break;
            case "TIGRE":
                result = "É um animal silvestre";
                break;
            default:
                result = "Animal desconhecido";

        }
        return result;
    }
}
