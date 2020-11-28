package financeira;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Financeira {
	
	private String cnpj;
    private String nome;
// lombok fucked me up indeed!!	
    public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
    public Financeira(String cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
	}
    
}
