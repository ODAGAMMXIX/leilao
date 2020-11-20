package enums;

public enum TypeVehicle {
    CARRO("Carro"),
    MOTO("Moto"),
    CAMINHAO("Caminhão");

    public String type;
    TypeVehicle(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
