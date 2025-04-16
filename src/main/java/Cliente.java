import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	private String nome;
	private String cpf;
	private Integer idade;

	public Boolean verificarMaioridade() {
		return idade >= 18;
	}

}
