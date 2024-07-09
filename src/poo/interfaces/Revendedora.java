package poo.interfaces;

public class Revendedora {
    public static void main(String[] args){
        ICarro ferrari = new Ferrari();
        ferrari.disponivel("Essa ferrari de " + ferrari.potencia() + " está disponível pelo valor de " + ferrari.valor());
        ferrari.tipo("Carro Esportivo");
        System.out.println(" ");
        ICarro civic = new Civic();
        civic.disponivel("Esse civic de " + civic.potencia() + " está disponível pelo valor de " + civic.valor());
        civic.tipo("Carro de Alto padrão");
        System.out.println(" ");
        ICarro uno = new Uno();
        uno.disponivel("Esse uno de " + uno.potencia() + " está disponível pelo valor de " + uno.valor());
        uno.tipo("Carro Econômico");
    }
}
