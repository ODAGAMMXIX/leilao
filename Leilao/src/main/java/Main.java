import auction.Auction;
import enums.TypeImmobile;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        Auction auction = new Auction(1, date);

        /* Cadastro de Imovel */
        String type = TypeImmobile.CASA.getType();
        String address = "Rua Linconl";
        Integer cep = 11121544;
        System.out.println("|| CADASTRANDO IMOVEL ||");
        auction.registerNewImmobile(1, 150000.50, type, address, cep);
        auction.registerNewImmobile(2, 150000.50, type, address, cep);

        System.out.println("|| CADASTRANDO movel ||");
        auction.registerNewVehicle(1, 50000.0, "Prisma", "Carro", 2020);
        auction.registerNewVehicle(2, 50000.0, "Prismaa", "Carro", 2020);
        auction.updateVehicle(2, 50000.0, "Celta", "Carro", 2020);
        auction.removeVehicle(1);
        auction.removeImmobilies(1);
        System.out.println("\n || EXIBINDO IMOVEIS CADASTRADOS ||");
        auction.showAllProducts();

    }
}
