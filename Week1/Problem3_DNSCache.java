import java.util.HashMap;

public class Problem3_DNSCache {

    static HashMap<String, String> dns = new HashMap<>();

    public static String resolve(String domain){

        if(dns.containsKey(domain)){
            return dns.get(domain);
        }

        String ip = "192.168.1.1";
        dns.put(domain, ip);

        return ip;
    }

    public static void main(String[] args){

        System.out.println(resolve("google.com"));
        System.out.println(resolve("google.com"));
    }
}