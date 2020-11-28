package dtos;

import auction.Auction;
import cliente.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import products.Product;

@AllArgsConstructor
@Getter
@Setter
public class LancesDTO {
    private Cliente cliente;
    private Double  lance;
    private Auction leilao;
	public LancesDTO(Cliente cliente, Double lance, Auction leilao) {
		super();
		this.cliente = cliente;
		this.lance = lance;
		this.leilao = leilao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getLance() {
		return lance;
	}
	public void setLance(Double lance) {
		this.lance = lance;
	}
	public Auction getLeilao() {
		return leilao;
	}
	public void setLeilao(Auction leilao) {
		this.leilao = leilao;
	}

    

}
// LOMBOK NÃO FEZ
