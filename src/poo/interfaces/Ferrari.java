package poo.interfaces;

public class Ferrari implements ICarro{
    @Override
    public String potencia() {
        return "750 cv";
    }

    @Override
    public String valor() {
        return "R$ 1.500.000,00";
    }

    @Override
    public void disponivel(String venda) {
        System.out.println(venda);
    }
}
