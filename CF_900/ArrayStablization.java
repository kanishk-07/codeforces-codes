import java.io.*;
//import java.util.*;

public class ArrayStablization {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long ans = 0, oneMax = Long.MIN_VALUE, twoMax = Long.MIN_VALUE, oneMin = Long.MAX_VALUE, twoMin = Long.MAX_VALUE;
        String[] str = br.readLine().split("\\s+");
        long[] arr = new long[n];
        for (int i=0; i<n; i++) {
            arr[i] = Long.parseLong(str[i]);
            if(arr[i]>=oneMax) {
                twoMax = oneMax;
                oneMax = arr[i];
            } else if (arr[i]>=twoMax) {
                twoMax = arr[i];
            }
            if(arr[i]<=oneMin) {
                twoMin = oneMin;
                oneMin = arr[i];
            } else if (arr[i]<=twoMin) {
                twoMin = arr[i];
            }
        }
        ans = oneMax-oneMin;
        ans = Math.min(ans, twoMax-oneMin);
        ans = Math.min(ans, oneMax-twoMin);
        System.out.println(ans);
    }
}