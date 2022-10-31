import java.io.*;
//import java.util.*;

public class NitDestroysUniverse {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine()), c0 = 0;
            int firstNonZero = -1, lastNonZero = -1;
            String[] str = br.readLine().split("\\s+");
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            for(int i = 0;i<n;i++) {
                if(arr[i]==0) {
                    c0++;
                }
                else {
                    lastNonZero = i;
                    if(firstNonZero==-1)
                        firstNonZero = i;
                }
            }
            if(c0==n) {
                System.out.println(0);
                continue;
            }
            int ans = 1;
            for (int i=firstNonZero; i<=lastNonZero; i++) {
                if(arr[i]==0)
                    ans = 2;
            }
            System.out.println(ans);
        }
    }
}