package poo.interfaces;

public class Civic implements ICarro{
    @Override
    public String potencia() {
        return "150 cv";
    }

    @Override
    public String valor() {
        return "R$ 120.000,00";
    }

    @Override
    public void disponivel(String venda) {
        System.out.println(venda);
    }
}
