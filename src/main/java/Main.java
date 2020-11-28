import auction.Auction;
import auction.ManageAudictions;
import enums.TypeImmobile;
import financeira.Financeira;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate newDate = LocalDate.parse("2020-01-01");
        LocalDate newDate2 = LocalDate.parse("2020-02-01");
        Financeira financeira = new Financeira("123456", "Teste");
        Auction auction = new Auction(
                1, newDate, "Rua Linconl",
                "Caçapava", "São Paulo", financeira
        );

        ManageAudictions manageAudictions = new ManageAudictions();
        manageAudictions.registerNewAuction(2, newDate2, "Rua aaa",
                "Caçapava", "São Paulo", financeira);
        manageAudictions.registerNewAuction(1, newDate, "Rua Linconl",
                "Caçapava", "São Paulo", financeira);

        manageAudictions.getAuctions().get(1).registerNewImmobile(
                1,
                55.00,
                "casa",
                "Rua abc",
                86464656,
                "Casa de Praia"
        );
        manageAudictions.getAuctions().get(1).registerNewImmobile(
                2,
                55.00,
                "casa",
                "Rua abc",
                86464656,
                "Casa Condominio"
        );
        manageAudictions.getAuctions().get(1).filterValue(33.0, 33.0);
        manageAudictions.sortValue();


    }
}
