package poo.interfaces;

public interface ICarro {
    public String potencia();
    public String valor();
    public void disponivel(String venda);
    default void tipo (String modelo){
        System.out.println(modelo);
    }
}
