package poo.agregacao;

public class Programa {

    public static void main(String[] args) {
        Produto produtoTV = criarProduto(1l, 10d, "TV");
        Produto produtoCel = criarProduto(2l, 1000d, "Celular");

        Vendedor vendedor = criarVendedor("mateus", 0.2);

        Comprador comprador = criarComprador("gilberto", 2000);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprado(comprador);
        venda.add(produtoTV);
        venda.add(produtoCel);

        venda.concretizarVenda();
        System.out.println(venda);
        venda.cancelarVenda();
        venda = null;
        System.out.println(venda);


    }

    private static Comprador criarComprador(String nome, double verba) {
        Comprador comprador = new Comprador();
        comprador.setNome(nome);
        comprador.setVerba(verba);
        return comprador;
    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }


    private static Produto criarProduto (Long codigo, Double valor, String nome) {
            Produto produto = new Produto();
            produto.setCodigo(codigo);
            produto.setPreco(valor);
            produto.setNome(nome);
            return produto;
        }
    }
