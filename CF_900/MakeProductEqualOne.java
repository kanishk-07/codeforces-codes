import java.io.*;
//import java.util.*;

public class MakeProductEqualOne {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), c0 = 0, cn = 0;
        long ans = 0;
        String[] str = br.readLine().split("\\s+");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for (int i : arr) {
            if(i==-1) {
                cn++;
            } else if (i > 1) {
                ans = ans + (i - 1);
            } else if (i < -1) {
                ans = ans + (-1 - i);
                cn++;
            } else if (i == 0)
                c0++;
        }
        if(c0==0 && cn%2==1)
            ans+=2;
        System.out.println(ans + c0);
    }
}