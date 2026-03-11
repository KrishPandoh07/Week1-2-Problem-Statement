import java.util.HashMap;

public class Problem2_FlashSaleInventory {

    static HashMap<String, Integer> stock = new HashMap<>();

    public static boolean purchase(String product) {

        int count = stock.getOrDefault(product, 0);

        if(count > 0){
            stock.put(product, count - 1);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        stock.put("IPHONE15", 3);

        System.out.println(purchase("IPHONE15"));
        System.out.println(purchase("IPHONE15"));
        System.out.println(purchase("IPHONE15"));
        System.out.println(purchase("IPHONE15"));
    }
}