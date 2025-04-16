
public class Main {

	public static void main(String[] args) {
		Banco b = new Banco();
		b.setNome("Brasil");
		
		Cliente juliana = new Cliente("Juliana", "123456", 18);
		
		Conta cc = new ContaCorrente(juliana, 1000);
		b.adicionarContas(cc);
		Conta poupanca = new ContaPoupanca(juliana,0.01);
		b.adicionarContas(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Cliente ana = new Cliente("Ana", "123457", 20);		
		Conta cc2 = new ContaCorrente(ana, 2000);
		b.adicionarContas(cc2);
		Conta cp = new ContaPoupanca(ana, 0.05);
		b.adicionarContas(cp);
		cc2.depositar(5000);
		cc2.sacar(5500);
		cc2.imprimirExtrato();
		cp.depositar(1000);
		cp.imprimirExtrato();

		b.listarClientes();

		CartaoCredito credito = new CartaoCredito(cc2, "1020 5020", 6000.0);
		credito.realizarPagamento(500);
		credito.mostrarInfoCartao();
	}

}
