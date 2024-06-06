package LacosDeRepeticao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForExample {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Qual numero voce deseja a tabuada?");
        int x = s.nextInt();
        List<Integer> valores = new ArrayList<>();
        for(int i = 0; i<=10; i++){
            System.out.println(x + " X " + i + " = " + x*i);
            valores.add(i);
        }
        for(Integer i : valores){
            System.out.println("Linha" +i);

        }

    }
}
