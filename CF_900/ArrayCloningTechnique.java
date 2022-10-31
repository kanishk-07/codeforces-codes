import java.io.*;
import java.util.*;

public class ArrayCloningTechnique {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine()), count = 0, max = Integer.MIN_VALUE;
            String[] str = br.readLine().split("\\s+");
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                max = Math.max(max, map.get(i));
            }
            int bad = n-max;
            while(max<n) {
                count = count + Math.min(max, bad);
                bad -= max;
                max*=2;
                count++;
            }
            System.out.println(count);
        }
    }
}