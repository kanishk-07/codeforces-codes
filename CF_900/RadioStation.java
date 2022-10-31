import java.io.*;
import java.util.HashMap;

public class RadioStation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]);
        HashMap<String, String> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            str = br.readLine().split("\\s+");
            map.put(str[1]+";", str[0]);
        }
        for(int i=0;i<m;i++) {
            str = br.readLine().split("\\s+");
            System.out.println(str[0]+" "+str[1]+" #"+map.get(str[1]));
        }
    }
}