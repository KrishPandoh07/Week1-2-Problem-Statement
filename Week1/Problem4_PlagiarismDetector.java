import java.util.*;

public class Problem4_PlagiarismDetector {

    static HashMap<String, Integer> wordFreq = new HashMap<>();

    public static void analyze(String text){

        String[] words = text.split(" ");

        for(String w : words){
            wordFreq.put(w, wordFreq.getOrDefault(w,0)+1);
        }

        System.out.println(wordFreq);
    }

    public static void main(String[] args){

        analyze("this is a sample text this is sample");
    }
}