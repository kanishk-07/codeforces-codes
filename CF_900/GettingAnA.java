import java.io.*;
import java.util.*;

public class GettingAnA {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("\\s+");
        long arr[] = new long[n], sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
            sum += arr[i];
        }
        Arrays.sort(arr);
        double div = ((double)sum) / ((double)n);
        int ans = 0;
        while (div < 4.5) {
            ans++;
            for (int i = 0; i < n; i++) {
                if (arr[i] < 5) {
                    sum += (5 - arr[i]);
                    arr[i] = 5;
                    break;
                }
            }
            div = ((double)sum) / ((double)n);
        }
        System.out.println(ans);
    }
}