
public class ContaCorrente extends Conta {

	private Double chequeEspecial;
	
	public ContaCorrente(Cliente cliente, double chequeEspecial) {
		super(cliente);
		this.chequeEspecial = chequeEspecial;
	}

	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public boolean sacar(double valor) {
		if (valor <= (saldo + chequeEspecial)) {
			if (valor > saldo) {
				double diferenca = valor - saldo;
				chequeEspecial -= diferenca;
				saldo = 0.0;
			} else saldo -= valor;
			return true;
		} return false;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		System.out.println("Cheque especial: R$" + chequeEspecial);
	}
	
}
