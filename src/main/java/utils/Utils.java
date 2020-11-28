package utils;

import java.util.Map;

public class Utils {
    public void showMap(Map hashMap){
        for (int index = 1; index <= hashMap.size(); index++){
            try{
                System.out.println(hashMap.get(index).toString());
            }
            catch (NullPointerException exception){
                System.out.println("continue");
            }

        }
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }

    protected boolean checkIfNull(Object value){
        return value != null;
    }

    public void removeMessage(Integer id){
        System.out.println("Registro " + id +" removido");
    }

    public void updateMessage(Integer id){
        System.out.println("Registro " + id +" removido");
    }

    public void nullPointerMessage(Integer id){
        System.out.println("Registro " + id +" não encontrado");
    }
}
