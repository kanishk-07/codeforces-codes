import java.io.*;
//import java.util.*;

public class MysticPermutation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split("\\s+");
            int[] arr = new int[n];
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
                ans[i] = i + 1;
            }
            int i = 0;
            for (i = 0; i < n; i++) {
                if (arr[i] != ans[i]) {
                    continue;
                }
                int tmp = ans[i];
                if (i < n - 1) {
                    ans[i] = ans[i + 1];
                    ans[i + 1] = tmp;
                } else if (i - 1 > 0) {
                    ans[i] = ans[i - 1];
                    ans[i - 1] = tmp;
                } else {
                    break;
                }
            }
            if (i < n) {
                System.out.println(-1);
                continue;
            }
            for (int l = 0; l < n; l++) {
                System.out.print(ans[l] + " ");
            }
            System.out.println();
        }
    }
}