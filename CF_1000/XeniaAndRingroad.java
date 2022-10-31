import java.io.*;
//import java.util.*;

public class XeniaAndRingroad {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        long ans = 0;
        int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]), loc = 1;
        ;
        str = br.readLine().split("\\s+");
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < m; i++) {
            int now = arr[i];

            if (now >= loc)
                ans += now - loc;
            else
                ans += n - (loc - now);
            loc = now;
        }
        System.out.println(ans);
    }
}