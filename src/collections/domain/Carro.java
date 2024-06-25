package collections.domain;

public class Carro implements Comparable<Carro>{

    private String modelo;
    private String marca;
    private String versao;
    private double valor;

    public Carro(String modelo, String marca, String versao, double valor){
        this.modelo = modelo;
        this.marca = marca;
        this.versao = versao;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public int compareTo(Carro modelo) {
        return this.modelo.compareTo(modelo.getModelo());
    }



}
