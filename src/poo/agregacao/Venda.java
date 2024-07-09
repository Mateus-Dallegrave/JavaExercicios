package poo.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Comprador comprado;

    private Vendedor vendedor;

    private List<Produto> produtos;

    public Venda(){
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprado() {
        return comprado;
    }

    public void setComprado(Comprador comprado) {
        this.comprado = comprado;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void add(Produto produto){
        this.produtos.add(produto);
    }

    public void concretizarVenda(){
        System.out.println("Comprador " + this.comprado.getNome());
        System.out.println("Comprou os Itens: ");
        for(Produto prod : this.produtos){
            System.out.println("Nome produto: " + prod.getNome() + ", Valor do produto: " + prod.getPreco());
        }
    }

    public void cancelarVenda(){

    }

    @Override
    public String toString() {
        return "Venda{" +
                "comprado=" + comprado.getNome() +
                ", vendedor=" + vendedor.getNome() +
                ", produtos=" + produtos +
                '}';
    }
}
