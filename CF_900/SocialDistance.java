import java.io.*;
import java.util.*;

public class SocialDistance {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int n = Integer.parseInt(str[0]);
            long m = Long.parseLong(str[1]), empty = 0;
            str = br.readLine().split("\\s+");
            long[] arr = new long[n];
            for (int i=0; i<n; i++) {
                arr[i] = Long.parseLong(str[i]);
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++) {
                if(i==n-1)
                    empty+=arr[i];
                else
                    empty+=arr[i+1];
            }
            if(n+empty<=m)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}