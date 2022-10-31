import java.io.*;
//import java.util.*;

public class EqualizePrices {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int n = Integer.parseInt(str[0]), k = Integer.parseInt(str[1]);
            str = br.readLine().split("\\s+");
            long arr[] = new long[n];
            for (int i=0; i<n; i++) {
                arr[i] = Long.parseLong(str[i]);
            }
            long ansMin = Math.max(0, arr[0]-k), ansMax = arr[0]+k;
            for (int i=1; i<n; i++) {
                long min = Math.max(0, arr[i]-k), max = arr[i] + k;
                if(ansMin>max || ansMax<min) {
                    ansMax = -1;
                    break;
                }
                ansMax = Math.min(ansMax, max);
                ansMin = Math.max(ansMin, min);
            }
            System.out.println(ansMax);
        }
    }
}