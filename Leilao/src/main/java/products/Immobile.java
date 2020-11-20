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
            String typeImmobile, Integer cep
    ) {

        super(id, value, auction);

        this.address = address;
        this.typeImmobile = typeImmobile;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "Id ='" + getId() + '\'' +
                ", Valor ='" + getValue() + '\'' +
                ", Tipo ='" + typeImmobile + '\'' +
                ", Endereço ='" + address + '\'' +
                ", cep =" + cep +
                '}';
    }
}
