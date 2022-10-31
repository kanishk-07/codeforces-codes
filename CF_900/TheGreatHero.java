import java.io.*;
import java.util.*;

public class TheGreatHero {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] str = br.readLine().split("\\s+");
            int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]), n = Integer.parseInt(str[2]);
            str = br.readLine().split("\\s+");
            int[][] arr = new int[n][2]; // 0-attack, 1-health
            for (int i = 0; i < n; i++) {
                arr[i][0] = Integer.parseInt(str[i]);
            }
            str = br.readLine().split("\\s+");
            for (int i = 0; i < n; i++) {
                arr[i][1] = Integer.parseInt(str[i]);
            }
            Arrays.sort(arr, (p, q) -> (p[0] - q[0]));
            for (int i = 0; i < n; i++) {
                if (b <= 0)
                    break;
                int k1 = arr[i][1] / a;
                int k2 = arr[i][1] % a;
                if (k2 > 0)
                    k1++;
                int k3 = b / arr[i][0];
                int k4 = b % arr[i][0];
                if (k4 > 0)
                    k3++;
                int matches = Math.min(k1, k3);
                b -= (matches * arr[i][0]);
                arr[i][1] -= (matches * a);
            }
            if (arr[n - 1][1] > 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}