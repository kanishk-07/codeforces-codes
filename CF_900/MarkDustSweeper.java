import java.io.*;
//import java.util.*;

public class MarkDustSweeper {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            long ans = 0;
            String[] str = br.readLine().split("\\s+");
            int[] arr = new int[n];
            for (int i=0; i<n-1; i++) {
                arr[i] = Integer.parseInt(str[i]);
                if(arr[i]==0 && ans!=0)
                    ans++;
                else
                    ans+=arr[i];
            }
            System.out.println(ans);
        }
    }
}