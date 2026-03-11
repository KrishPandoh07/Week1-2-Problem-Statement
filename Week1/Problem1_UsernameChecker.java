import java.util.*;

public class Problem1 {

    static HashMap<String, Integer> users = new HashMap<>();

    public static boolean checkAvailability(String username) {
        return !users.containsKey(username);
    }

    public static void registerUser(String username, int id) {
        users.put(username, id);
    }

    public static void main(String[] args) {

        registerUser("john_doe", 1);

        System.out.println(checkAvailability("john_doe"));
        System.out.println(checkAvailability("jane_smith"));
    }
}