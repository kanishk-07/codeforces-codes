import java.io.*;
import java.util.*;

public class BurglarAndMatches {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]), arr[][] = new int[m][2];
        long ans = 0;
        for(int i=0;i<m;i++) {
            str = br.readLine().split("\\s+");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        Arrays.sort(arr, (a,b)->(b[1]-a[1]));
        for(int i=0;i<m;i++) {
            if(n<=0)
                break;
            if(arr[i][0]<=n) {
                ans+=(arr[i][0]*arr[i][1]);
            } else {
                ans+=(n*arr[i][1]);
            }
            n-=arr[i][0];
        }
        System.out.println(ans);
    }
}