import java.util.*;

public class Problem5_AnalyticsDashboard {

    static HashMap<String,Integer> visits = new HashMap<>();

    public static void visit(String page){

        visits.put(page, visits.getOrDefault(page,0)+1);
    }

    public static void main(String[] args){

        visit("/home");
        visit("/home");
        visit("/sports");

        System.out.println(visits);
    }
}