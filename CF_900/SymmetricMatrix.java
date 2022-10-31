import java.io.*;
//import java.util.*;

public class SymmetricMatrix {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str[] = br.readLine().split("\\s+"), ans = "NO";
            int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]), k = 0;
            int arr[][][] = new int[n][2][2];
            for (int i = 0; i < n; i++) {
                str = br.readLine().split("\\s+");
                arr[i][0][0] = Integer.parseInt(str[0]);
                arr[i][0][1] = Integer.parseInt(str[1]);
                str = br.readLine().split("\\s+");
                arr[i][1][0] = Integer.parseInt(str[0]);
                arr[i][1][1] = Integer.parseInt(str[1]);
            }
            if (m % 2 == 0) {
                for (k = 0; k < n; k++) {
                    if (arr[k][1][0] == arr[k][0][1]) {
                        ans = "YES";
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}