import java.io.*;
//import java.util.*;

public class MaximalContinuousRest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long ans = 0, rests = 0;
        String[] str = br.readLine().split("\\s+");
        long[] arr = new long[n];
        for (int i=0; i<n; i++) {
            arr[i] = Long.parseLong(str[i]);
        }
        for (int i=0; i<2*n; i++) {
            int j = i%n;
            if(arr[j]==1)
                rests++;
            else
                rests = 0;
            ans = Math.max(ans, rests);
        }
        System.out.println(ans);
    }
}