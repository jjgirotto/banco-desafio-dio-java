
public class ContaPoupanca extends Conta {

	private Double rendimento;
	
	public ContaPoupanca(Cliente cliente, double rendimento) {
		super(cliente);
		this.rendimento = rendimento;
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
		System.out.println("Rendimento: R$" + rendimento*saldo);
	}
}
