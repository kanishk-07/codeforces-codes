import java.io.*;
//import java.util.*;

public class MakeItIncreasing {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine()), ans = 0, minSoFar = Integer.MAX_VALUE, i=n-1;
            String[] str = br.readLine().split("\\s+");
            int[] arr = new int[n];
            for (i=n-1; i>=0; i--) {
                arr[i] = Integer.parseInt(str[i]);
                while(arr[i]>=minSoFar) {
                    if(arr[i]==0)
                        break;
                    arr[i] = arr[i]/2;
                    ans++;
                }
                if(arr[i]==0 && i!=0) {
                    System.out.println(-1);
                    break;
                }
                minSoFar = Math.min(minSoFar, arr[i]);
            }
            if(i==-1)
                System.out.println(ans);
        }
    }
}