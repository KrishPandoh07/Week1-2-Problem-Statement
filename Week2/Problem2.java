import java.util.HashMap;

public class Problem2 {

    static HashMap<String, Integer> inventory = new HashMap<>();

    public static boolean purchaseItem(String product) {

        int stock = inventory.getOrDefault(product, 0);

        if (stock > 0) {
            inventory.put(product, stock - 1);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        inventory.put("IPHONE15", 3);

        System.out.println(purchaseItem("IPHONE15"));
        System.out.println(purchaseItem("IPHONE15"));
        System.out.println(purchaseItem("IPHONE15"));
        System.out.println(purchaseItem("IPHONE15"));
    }
}