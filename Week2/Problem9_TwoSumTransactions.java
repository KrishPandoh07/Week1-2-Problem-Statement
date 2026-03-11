import java.util.*;

public class Problem9_TwoSumTransactions {

    public static void twoSum(int[] arr,int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){

            int comp = target-num;

            if(map.containsKey(comp)){
                System.out.println(num+" "+comp);
            }

            map.put(num,1);
        }
    }

    public static void main(String[] args){

        int arr[]={300,200,500,100};

        twoSum(arr,500);
    }
}