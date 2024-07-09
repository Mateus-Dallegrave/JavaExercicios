package poo.composicao;

public class App {

    public static void main (String[] args){
        primeiroBanco();
        segundoBanco();

    }

    private static void primeiroBanco() {
        Banco banco = new Banco();
        banco.setNome("Santander");
        banco.setCodigo(10L);

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(100d);
        cc.setChequeEspecial(50d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(1000d);

        banco.add(cc);
        banco.add(cp);

        System.out.println("********Banco 1********");
        System.out.println("Conta corrente no banco " + banco.getNome() + " com saldo de: " + cc.getSaldo());
        System.out.println("Conta poupança no banco " + banco.getNome() + " com saldo de: " + cp.getSaldo());
        System.out.println(" ");
    }

    private static void segundoBanco() {
        Banco banco = new Banco();
        banco.setNome("Itau");
        banco.setCodigo(20L);

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(200d);
        cc.setChequeEspecial(20d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(5000d);

        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.setBanco(banco);
        cp1.setSaldo(10000d);

        banco.add(cc);
        banco.add(cp);
        banco.add(cp1);

        System.out.println("********Banco 2********");
        System.out.println("Conta corrente no banco " + banco.getNome() + " com saldo de: " + cc.getSaldo());
        System.out.println("Conta poupança no banco " + banco.getNome() + " com saldo de: " + cp.getSaldo());
        System.out.println(" ");
        System.out.println(cp1.getSaldo());
    }
}
