import java.util.*;

public class Problem10_MultiLevelCache {

    static HashMap<String,String> L1 = new HashMap<>();

    public static String getVideo(String id){

        if(L1.containsKey(id)){
            return "L1 HIT";
        }

        L1.put(id,"videoData");
        return "Loaded from DB";
    }

    public static void main(String[] args){

        System.out.println(getVideo("video1"));
        System.out.println(getVideo("video1"));
    }
}