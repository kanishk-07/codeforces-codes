import java.io.*;
import java.util.*;

public class TwoGram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), max = 0;
        String str = br.readLine(), ans = "";
        char[] ch = str.toCharArray();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<n-1;i++) {
            String s = String.valueOf(ch[i]) + String.valueOf(ch[i+1]);
            map.put(s, map.getOrDefault(s, 0) + 1);
            if(map.get(s)>max) {
                max = map.get(s);
                ans = s;
            }
        }
        System.out.println(ans);
    }
}