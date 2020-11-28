package auction;

import financeira.Financeira;
import lombok.Getter;
import lombok.Setter;
import products.Immobile;
import products.Vehicle;
import utils.Utils;

import java.time.LocalDate;
import java.util.*;
@Getter
@Setter
public class ManageAudictions extends Utils {
    private final Map<Integer, Auction> auctions = new TreeMap<Integer,Auction>();
//inclui pq LOMBOK NÃO O FEZ
    public Map<Integer, Auction> getAuctions() {
		return auctions;
	}

	public void registerNewAuction(
            Integer id, LocalDate date,
            String local, String cidade,
            String estado, Financeira financeira
    ){
        Auction auction = new Auction(id, date, local, cidade, estado, financeira);
        auctions.put(id, auction);

    }

    public void removeAuction(Integer id){
        auctions.remove(id);
        removeMessage(id);
    }

    public void updateAuction(
            Integer id, LocalDate date,
            String local, String cidade,
            String estado
    ){
        try{
            Auction auction = auctions.get(id);
            if(checkIfNull(date)){
                auction.setDate(date);
            }
            if(checkIfNull(local)){
                auction.setLocal(local);
            }
            if(checkIfNull(cidade)){
                auction.setCidade(cidade);
            }
            if(checkIfNull(estado)){
                auction.setEstado(estado);
            }
        }
        catch (NullPointerException e){
            nullPointerMessage(id);
        }
    }

    public void sortValue(){
        Map<Integer, Auction> sorted = sortByValue(auctions);
        printMap(sorted);
    }



    private static Map<Integer, Auction> sortByValue(Map<Integer, Auction> unsortMap) {
        List<Map.Entry<Integer, Auction>> list =
                new LinkedList<Map.Entry<Integer, Auction>>(unsortMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Auction>>() {
            @Override
            public int compare(Map.Entry<Integer, Auction> o1,
                               Map.Entry<Integer, Auction> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        Map<Integer, Auction> sortedMap = new LinkedHashMap<Integer, Auction>();
        for (Map.Entry<Integer, Auction> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public void showLeilaoDetail(Integer id){
        try{
            Auction auction = auctions.get(id);
            System.out.println(auction.toString());


        }
        catch (NullPointerException e){

        }

    }

}
