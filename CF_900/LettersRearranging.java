import java.io.*;
import java.util.*;

public class LettersRearranging {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String str = br.readLine();
            char[] arr = str.toCharArray();
            int n = arr.length;
            char[] ans = new char[n];
            HashMap<Character, Integer> map = new HashMap<>();
            HashSet<Character> set = new HashSet<>();
            for(char i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                set.add(i);
            }
            if(set.size()==1) {
                System.out.println(-1);
            } else {
                int k=0;
                for(char i : set) {
                    int freq = map.get(i);
                    while(freq-->0) {
                        ans[k++] = i;
                    }
                }
                System.out.println(new String(ans));
            }
        }
    }
}