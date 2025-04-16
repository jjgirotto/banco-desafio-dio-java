
public class Cliente {

	private String nome;
	private String cpf;
	private Integer idade;

	public Cliente(){

	}

	public Cliente(String nome, String cpf, Integer idade){
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Boolean verificarMaioridade() {
		return idade >= 18;
	}

}
