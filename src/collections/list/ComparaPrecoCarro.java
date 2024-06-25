package collections.list;

import collections.domain.Carro;

import java.util.Comparator;

public class ComparaPrecoCarro implements Comparator<Carro> {
    @Override
    public int compare(Carro o1, Carro o2) {
        return Double.compare(o2.getValor(), o1.getValor());
    }
}
