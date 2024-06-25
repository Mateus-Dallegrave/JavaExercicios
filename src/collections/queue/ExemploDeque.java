package collections.queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class ExemploDeque {

    public static void main(String[] args){
        Acessando();
        Removendo();
        Adicionando();
    }

    private static void Acessando() {
        System.out.println("*****ACESSANDO*****");
        Deque<String> exemplo = new ArrayDeque<>();
        exemplo.add("Azul");
        exemplo.add("Rosa");
        exemplo.add("Lilas");
        exemplo.add("Amarelo");
        exemplo.add("Laraja");
        System.out.println(exemplo);
        Deque<String> exemplo1 = new ArrayDeque<>();
        exemplo1.add("Verde");
        exemplo1.add("Laranja");

        exemplo.addAll(exemplo1);
        System.out.println(exemplo);
        // System.out.println(exemplo.contains(exemplo1));
        System.out.println(exemplo.containsAll(exemplo1));
        System.out.println(exemplo.contains("Verde"));

        System.out.println(exemplo.element());
        System.out.println(exemplo.getFirst());
        System.out.println(exemplo.getLast());

        System.out.println(exemplo.peek());
        System.out.println(exemplo.peekFirst());
        System.out.println(exemplo.peekLast());
        System.out.println("");
    }

    private static void Removendo(){
        System.out.println("*****REMOVENDO*****");
        Deque<String> exemplo = new ArrayDeque<>();
        exemplo.add("Azul");
        exemplo.add("Rosa");
        exemplo.add("Lilas");
        exemplo.add("Amarelo");
        exemplo.add("Laraja");
        System.out.println(exemplo);
        Deque<String> exemplo1 = new ArrayDeque<>();
        exemplo1.add("Verde");
        exemplo1.add("Laranja");
        exemplo1.add("Marrom");
        exemplo1.add("Preto");
        exemplo1.add("Branco");

        exemplo.addAll(exemplo1);
        System.out.println(exemplo);
        String val = exemplo.remove();
        exemplo.remove("Laranja");
        System.out.println(exemplo);

        exemplo.removeFirst();
        exemplo.removeLast();
        System.out.println(exemplo);

        exemplo.poll();
        exemplo.pollFirst();
        exemplo.pollLast();

        System.out.println("Elements in the ArrayDeque after poll, pollFirst, pollLast: " + exemplo);

        exemplo.pop();
        System.out.println("Elements in the ArrayDeque after pop: " + exemplo);

        exemplo.retainAll(exemplo1);
        System.out.println("Elements in the ArrayDeque after retainAll: " + exemplo);

        exemplo.removeAll(exemplo1);
        System.out.println("Elements in the ArrayDeque after removeAll: " + exemplo);
        System.out.println("");
    }

    private static void Adicionando(){
        System.out.println("*****ADICIONANDO*****");
        Deque<String> exemplo = new ArrayDeque<>();
        exemplo.add("Azul");
        exemplo.addFirst("Rosa");
        exemplo.addLast("Lilas");
        System.out.println(exemplo);
        Deque<String> exemplo1 = new ArrayDeque<>();
        exemplo1.add("Verde");
        exemplo1.add("Laranja");

        exemplo.addAll(exemplo1);
        System.out.println(exemplo);

        boolean val = exemplo.offer("Jaipur");
        exemplo.offerFirst("Goa");
        exemplo.offerLast("Mumbai");

        System.out.println("Elements in the Deque after offer, offerFirst and offerLast: " + exemplo);

        exemplo.push("Kolkata");

        System.out.println("Elements in the Deque after push: " + exemplo);
        System.out.println("");
    }
}
