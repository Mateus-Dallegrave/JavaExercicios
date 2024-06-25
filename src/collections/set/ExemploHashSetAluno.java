package collections.set;
import collections.domain.Aluno;
import java.util.HashSet;
import java.util.Set;

public class ExemploHashSetAluno {

    public static void main(String[] args){
        exemploListaSimples();
        exemploRemovendo();
        exemploAcessando();
    }

    private static void exemploAcessando() {
        System.out.println("***** Exemplo Acessando******");
        Set<Aluno> exemplo = new HashSet<>();
        Aluno a = new Aluno("Aristóteles", "Filosofia", 10);
        Aluno b = new Aluno("Albert Einstein", "Física", 10);
        Aluno c = new Aluno("Michael Jackson", "Música", 10);
        Aluno d = new Aluno("Aristóteles", "Filosofia", 11);
        exemplo.add(a);
        exemplo.add(b);
        exemplo.add(c);
        System.out.println(exemplo);
        System.out.println(exemplo.contains(d));
    }

    private static void exemploRemovendo() {
        System.out.println("***** Exemplo Removendo ******");
        Set<Aluno> exemplo = new HashSet<>();
        Aluno a = new Aluno("Aristóteles", "Filosofia", 10);
        Aluno b = new Aluno("Albert Einstein", "Física", 10);
        Aluno c = new Aluno("Michael Jackson", "Música", 10);
        exemplo.add(a);
        exemplo.add(b);
        exemplo.add(c);
        System.out.println(exemplo);
        exemplo.remove(b);
        System.out.println(exemplo);
        System.out.println("");
    }

    private static void exemploListaSimples() {
        System.out.println("***** Exemplo ******");
        Set<Aluno> exemplo = new HashSet<>();
        Aluno a = new Aluno("Aristóteles", "Filosofia", 10);
        Aluno b = new Aluno("Albert Einstein", "Física", 10);
        Aluno c = new Aluno("Michael Jackson", "Música", 10);
        Aluno d = new Aluno("Aristóteles", "Filosofia", 11);
        exemplo.add(a);
        exemplo.add(b);
        exemplo.add(c);
        System.out.println(exemplo);
        System.out.println("");
    }
}
