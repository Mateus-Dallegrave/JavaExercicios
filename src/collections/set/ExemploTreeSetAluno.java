package collections.set;
import collections.domain.Aluno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSetAluno {
    public static void main(String[] args) {
        exemploTree();
    }

    private static void exemploTree() {
        Set<Aluno> exemplo = new TreeSet<>();
        Aluno a = new Aluno("Aristóteles", "Filosofia", 10);
        Aluno b = new Aluno("Albert Einstein", "Física", 10);
        Aluno c = new Aluno("Michael Jackson", "Música", 10);
        exemplo.add(a);
        exemplo.add(b);
        exemplo.add(c);
        System.out.println(exemplo);
    }

}