import java.io.*;
//import java.util.*;

public class Ugu {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()), ans = 0, f = 0;
            String str = br.readLine();
            char[] a = str.toCharArray();
            for (int i = 1; i < n; i++) {
                if (a[i] != a[i - 1]) {
                    if (f == 0 && a[i] == '0') {
                        f = 1;
                        ans++;
                    } else if (f == 1) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}