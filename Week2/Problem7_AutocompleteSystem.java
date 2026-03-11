import java.util.*;

public class Problem7_AutocompleteSystem {

    static HashMap<String,Integer> queries = new HashMap<>();

    public static void addQuery(String q){
        queries.put(q,queries.getOrDefault(q,0)+1);
    }

    public static void main(String[] args){

        addQuery("java tutorial");
        addQuery("java tutorial");
        addQuery("javascript");

        System.out.println(queries);
    }
}