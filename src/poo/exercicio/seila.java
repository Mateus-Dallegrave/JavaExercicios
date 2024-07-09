package poo.exercicio;

public class seila {
    public static void main(String[] args){
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Urubu do Pix");
        pessoaJuridica.setEndereco("Rua DEF");
        pessoaJuridica.setCnpj("0684803874");
        System.out.println(pessoaJuridica.getNome() + " " + pessoaJuridica.getEndereco() + " " + pessoaJuridica.getCnpj());
        System.out.println(" ");
        PessoFisica pessoaFisica = new PessoFisica();
        pessoaFisica.setNome("Mateus");
        pessoaFisica.setEndereco("Rua ABC");
        pessoaFisica.setCpf("0698431840");
        System.out.println(pessoaFisica.getNome() + " " + pessoaFisica.getEndereco() + " " + pessoaFisica.getCpf());

    }

}
