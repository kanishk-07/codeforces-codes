import java.io.*;
//import java.util.*;

public class CoverPoints {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long ans = 0;
        for(int i=0;i<n;i++) {
            String[] str = br.readLine().split("\\s+");
            int x = Integer.parseInt(str[0]), y = Integer.parseInt(str[1]);
            ans = Math.max(ans, x+y);
        }
        System.out.println(ans);
    }
}