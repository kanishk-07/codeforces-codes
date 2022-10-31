import java.io.*;
import java.util.*;

public class PowerWalking {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split("\\s+");
            int[] arr = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                set.add(arr[i]);
            }
            for (int i = 0; i < n; i++) {
                int power = 0, setSize = set.size();
                int k = i + 1;
                if (k <= setSize) {
                    power = setSize;
                } else {
                    power = k;
                }
                ans[i] = power;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}