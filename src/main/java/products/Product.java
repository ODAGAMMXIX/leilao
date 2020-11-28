package products;

import auction.Auction;
import cliente.Cliente;
import dtos.LancesDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
@AllArgsConstructor
public class Product {
    private Integer id;
    private Double value;
    private Integer auction;
    private String nome;
    private Map<Integer, LancesDTO> lances = new TreeMap<Integer, LancesDTO>();

    public Product(Integer id, Double value, Integer auction, String nome) {
        this.id = id;
        this.value = value;
        this.auction = auction;
        this.nome = nome;
    }
// LOMBOK NÃO FEZ.
    
    public int compareTo(Product otherProduct) {
        return this.getNome().compareTo( otherProduct.getNome());
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getAuction() {
		return auction;
	}

	public void setAuction(Integer auction) {
		this.auction = auction;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<Integer, LancesDTO> getLances() {
		return lances;
	}

	public void setLances(Map<Integer, LancesDTO> lances) {
		this.lances = lances;
	}

	public void sortByKey(){
        List sortedKeys = new ArrayList(lances.keySet());
        Collections.sort(sortedKeys);

        System.out.println(sortedKeys.toString());
    }

    public void makeLance(Auction leilao, Cliente cliente, Double lance, Integer id){
        LancesDTO dto = new LancesDTO(cliente, lance, leilao);
        lances.put(id, dto);
    }

    public void showHistorico(){

    }
}
