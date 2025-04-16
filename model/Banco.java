import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void listarClientes() {
		System.out.println("========== Clientes do banco " + nome + " ==========");
		for (Conta c : contas) {
			System.out.println("Conta: " + c.numero + " - Agência: " + c.agencia);
			System.out.println(c.getCliente());
		}
	}

	public void adicionarContas (Conta c) {
		contas.add(c);
	}

}
