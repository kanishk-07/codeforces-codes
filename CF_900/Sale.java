import java.io.*;
import java.util.*;

public class Sale {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]), ans = 0;
        str = br.readLine().split("\\s+");
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<m;i++) {
            if(arr[i]>=0)
                break;
            ans+=arr[i];
        }
        System.out.println(-ans);
    }
}