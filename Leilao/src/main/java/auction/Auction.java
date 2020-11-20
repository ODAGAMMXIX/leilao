package auction;

import com.sun.istack.internal.Nullable;
import enums.TypeImmobile;
import enums.TypeVehicle;
import lombok.Getter;
import lombok.Setter;
import org.omg.CORBA.Any;
import products.Immobile;
import products.Vehicle;

import java.time.LocalDate;
import java.util.*;

@Getter
@Setter
public class Auction {
    private Integer idAuction;
    private Date date;
    private List<Vehicle> vehicles = new ArrayList<Vehicle>();
    private List<Immobile> immobilises = new ArrayList<Immobile>();

    public Auction(Integer id, Date date){
        this.idAuction = id;
        this.date = date;
    }

    public void registerNewVehicle(
            Integer id, Double value,
            String model, String typeVehicle,
            Integer year
    ){
        Vehicle vehicle = new Vehicle(id, value, idAuction, typeVehicle, model, year);
        vehicles.add(vehicle);
        System.out.println(vehicle.toString() + " foi cadastrado");
    }

    public void removeVehicle(Integer id){
        Iterator<Vehicle> iterator = vehicles.iterator();
        boolean stop = false;
        while (iterator.hasNext() && !stop){
            Vehicle vehicle = iterator.next();
            if (vehicle.getId().equals(id)){
                iterator.remove();
                stop = true;
            }
        }
    }

    public void removeImmobilies(Integer id){
        Iterator<Immobile> iterator = immobilises.iterator();
        boolean stop = false;
        while (iterator.hasNext() && !stop){
            Immobile immobile = iterator.next();
            if (immobile.getId().equals(id)){
                iterator.remove();
                stop = true;
            }
        }
    }

    public void updateVehicle(
            Integer id, @Nullable Double value,
            @Nullable String model, @Nullable String typeVehicle,
            @Nullable Integer year
    ){
        Iterator<Vehicle> iterator = vehicles.iterator();
        boolean stop = false;
        while (iterator.hasNext() && !stop){
            Vehicle vehicle = iterator.next();
            if (vehicle.getId().equals(id)){
                if (!checkIfNull(value)){
                    vehicle.setValue(value);
                }
                if (!checkIfNull(model)){
                    vehicle.setModel(model);
                }
                if (!checkIfNull(typeVehicle)){
                    vehicle.setTypeVehicle(typeVehicle);
                }
                if (!checkIfNull(year)){
                    vehicle.setYear(year);
                }
                stop = true;
            }
        }
    }

    public void updateImmobile(
            Integer id, Double value,
            String typeImmobile,
            String address, Integer cep
    ){
        Iterator<Immobile> iterator = immobilises.iterator();
        boolean stop = false;
    }

    public void registerNewImmobile(
            Integer id, Double value,
            String typeImmobile,
            String address, Integer cep
    ){
        Immobile immobile = new Immobile(id, value, idAuction, address, typeImmobile, cep);
        immobilises.add(immobile);
        System.out.println(immobile.toString() + " foi cadastrado");
    }



    public void showAllProducts(){
        immobilises.forEach(immobile ->  System.out.println(immobile.toString()));
        vehicles.forEach(vehicle -> System.out.println(vehicle.toString()));
    }

    private boolean checkIfNull(Object value){
        return value == null;
    }

}
