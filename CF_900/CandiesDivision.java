import java.io.*;
//import java.util.*;

public class CandiesDivision {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int n = Integer.parseInt(str[0]), k = Integer.parseInt(str[1]);
            int extra = n%k, ans = n-extra;
            ans = ans + Math.min(extra, k/2);
            System.out.println(ans);
        }
    }
}