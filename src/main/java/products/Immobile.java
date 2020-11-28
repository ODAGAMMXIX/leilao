package products;

import enums.TypeImmobile;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Immobile extends Product {

    private String typeImmobile;
    private String address;
    private Integer cep;

    public Immobile(
            Integer id, Double value,
            Integer auction, String address,
            String typeImmobile, Integer cep,
            String nome
    ) {

        super(id, value, auction, nome);

        this.address = address;
        this.typeImmobile = typeImmobile;
        this.cep = cep;
    }

    // LOMBOK N�O FEZ
    

    public String getTypeImmobile() {
		return typeImmobile;
	}

	public void setTypeImmobile(String typeImmobile) {
		this.typeImmobile = typeImmobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	@Override
    public String toString() {
        return "Imovel{" +
                "Id ='" + getId() + '\'' +
                ", Nome ='" + getNome() + '\'' +
                ", Valor ='" + getValue() + '\'' +
                ", Tipo ='" + typeImmobile + '\'' +
                ", Endereço ='" + address + '\'' +
                ", cep =" + cep +
                '}';
    }
}
