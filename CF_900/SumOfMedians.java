import java.io.*;
//import java.util.*;

public class SumOfMedians {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int n = Integer.parseInt(str[0]), k = Integer.parseInt(str[1]), k1=k;
            long ans = 0;
            str = br.readLine().split("\\s+");
            long[] arr = new long[n*k];
            for (int i=0; i<n*k; i++) {
                arr[i] = Long.parseLong(str[i]);
            }
            if(n%2==1) {
                int med = n/2 + 1, y = n*k;
                while(k1-- > 0) {
                    ans+=arr[y-med];
                    y = y-med;
                }
            } else {
                int med = n/2, y = n*k;
                while(k1-- > 0) {
                    ans+=arr[y-med-1];
                    y = y-med-1;
                }
            }
            System.out.println(ans);
        }
    }
}