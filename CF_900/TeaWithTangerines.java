import java.io.*;
//import java.util.*;

public class TeaWithTangerines {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split("\\s+");
            long arr[] = new long[n], steps = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(str[i]);
            }
            long x = 2 * arr[0] - 1;
            for (int i = 0; i < n; i++) {
                steps += (arr[i] / x);
                if (arr[i] % x == 0)
                    steps--;
            }
            System.out.println(steps);
        }
    }
}