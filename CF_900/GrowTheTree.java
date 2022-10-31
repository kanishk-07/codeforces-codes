import java.io.*;
import java.util.*;

public class GrowTheTree {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("\\s+");
        long[] arr = new long[n];
        for (int i=0; i<n; i++) {
            arr[i] = Long.parseLong(str[i]);
        }
        Arrays.sort(arr);
        long ans = 0, x = 0, y = 0;
        for(int i=0;i<n/2;i++) {
            x+=arr[n-i-1];
            y+=arr[i];
        }
        if(n%2==1) {
            x+=arr[n/2];
        }
        ans = (x*x) + (y*y);
        System.out.println(ans);
    }
}