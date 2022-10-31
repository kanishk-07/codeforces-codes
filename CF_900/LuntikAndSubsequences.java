import java.io.*;
//import java.util.*;

public class LuntikAndSubsequences {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine()), c1 = 0, c0 = 0;
            long ans = 0;
            String[] str = br.readLine().split("\\s+");
            long[] arr = new long[n];
            for (int i=0; i<n; i++) {
                arr[i] = Long.parseLong(str[i]);
                //sum+=arr[i];
                if(arr[i]==1)
                    c1++;
                else if(arr[i]==0)
                    c0++;
            }
            ans = ((long)Math.pow(2, c0))*c1;
            System.out.println(ans);
        }
    }
}