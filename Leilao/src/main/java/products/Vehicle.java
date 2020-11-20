package products;
import enums.TypeVehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle extends Product {

    private String typeVehicle;
    private String model;
    private Integer year;

    public Vehicle(
            Integer id, Double value,
            Integer auction, String typeVehicle,
            String model, Integer year
    ) {
        super(id, value, auction);
        this.model = model;
        this.typeVehicle = typeVehicle;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Tipo do veiculo ='" + typeVehicle + '\'' +
                ", modelo ='" + model + '\'' +
                ", ano =" + year +
                '}';
    }
}
