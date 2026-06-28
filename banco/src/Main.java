import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        // Criando clientes
        Cliente joao = new Cliente();
        joao.setNome("João");

        Cliente maria = new Cliente();
        maria.setNome("Maria");

        // Criando contas
        ContaCorrente ccJoao = new ContaCorrente(joao);
        ContaPoupanca cpMaria = new ContaPoupanca(maria);

        // Operações
        ccJoao.depositar(1000);
        ccJoao.transferir(300, cpMaria);

        // Extratos
        ccJoao.imprimirExtrato();
        cpMaria.imprimirExtrato();
    }
}
