package cliente;

import auction.Auction;
import dtos.LancesDTO;
import lombok.Getter;
import lombok.Setter;
import products.Immobile;
import products.Product;

import java.util.*;

@Getter
@Setter
public class Cliente {
    private String nome;
    private String email;
    private String senha;
    private List<LancesDTO> lances = new ArrayList<LancesDTO>();

// LOMBOK FUCKED ME UP!
    
    

    public Cliente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<LancesDTO> getLances() {
		return lances;
	}

	public void setLances(List<LancesDTO> lances) {
		this.lances = lances;
	}
	public void inserirLance(LancesDTO lancedoCliente) { 
	this.lances.add(lancedoCliente);
	}

}
