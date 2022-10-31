import java.io.*;
import java.util.*;

public class Discounts {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("\\s+");
        int[] bars = new int[n];
        long sum = 0;
        for (int i=0; i<n; i++) {
            bars[i] = Integer.parseInt(str[i]);
            sum+=bars[i];
        }
        Arrays.sort(bars);
        int m = Integer.parseInt(br.readLine());
        str = br.readLine().split("\\s+");
        for (int i=0; i<m; i++) {
            int b = Integer.parseInt(str[i]) - 1;
            System.out.println(sum-bars[n-b-1]);
        }
    }
}