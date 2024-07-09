package poo.interfaces;

public class Uno implements ICarro{
    @Override
    public String potencia() {
        return "80 cv";
    }

    @Override
    public String valor() {
        return "R$ 15.000,00";
    }

    @Override
    public void disponivel(String venda) {
        System.out.println(venda);
    }
}
