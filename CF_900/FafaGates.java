import java.io.*;
//import java.util.*;

public class FafaGates {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), ans = 0, s1 = 0, s2 = 0;
        char[] s = br.readLine().toCharArray();
        for (int i = 0; i < n-1; i++) {
            if (s[i] == 'U') {
                s1++;
                if (s1 == s2 && s[i + 1] == 'U') {
                    ans++;
                }
            } else {
                s2++;
                if (s1 == s2 && s[i + 1] == 'R') {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}