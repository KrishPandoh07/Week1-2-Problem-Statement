import java.util.*;

public class Problem8_ParkingLotHashing {

    static HashMap<String,Integer> parking = new HashMap<>();

    public static void park(String plate,int spot){
        parking.put(plate,spot);
    }

    public static void main(String[] args){

        park("ABC123",1);
        park("XYZ999",2);

        System.out.println(parking);
    }
}