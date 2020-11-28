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
            String model, Integer year, String nome
    ) {
        super(id, value, auction, nome);
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

    // LOMBOK N�O FEZ
	public String getTypeVehicle() {
		return typeVehicle;
	}


	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}
}
