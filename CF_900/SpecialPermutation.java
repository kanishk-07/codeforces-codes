import java.io.*;
//import java.util.*;

public class SpecialPermutation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int n = Integer.parseInt(str[0]), a = Integer.parseInt(str[1]), b = Integer.parseInt(str[2]);
            int[] ans = new int[n];
            int m = (n/2)-1, l = -1, r = -1;
            if(a<b) {
                l = n-a-1;
                r = b-2;
            } else {
                l = n-a;
                r = b-1;
            }
            if(l<m || r<m) {
                System.out.print(-1);
            } else {
                ans[0] = a;
                ans[n-1] = b;
                int j = n;
                for(int i=1; i<n-1; i++) {
                    if(j==a || j==b)
                        j--;
                    if(j==a || j==b)
                        j--;
                    ans[i] = j;
                    j--;
                }
                for(int i=0; i<n; i++) {
                    System.out.print(ans[i]+" ");
                }
            }
            System.out.println();
        }
    }
}