package collections.queue;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploPriorityQueue {

    public static void main(String[] args){
        Queue<String> exemplo = new PriorityQueue<>();
        exemplo.add("mateus");
        exemplo.add("juliana");
        exemplo.add("bruna");
        exemplo.add("amanda");
        while(!exemplo.isEmpty()){
            System.out.println(exemplo.remove());

//            Possui Ordenação Natural
        }
    }
}

