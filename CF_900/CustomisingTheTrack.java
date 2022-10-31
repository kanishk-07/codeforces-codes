import java.io.*;
//import java.util.*;

public class CustomisingTheTrack {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long sum = 0;
            String[] str = br.readLine().split("\\s+");
            for (int i=0; i<n; i++) {
                sum += Long.parseLong(str[i]);;
            }
            long extras = sum%n;
            System.out.println(extras*(n-extras));
        }
    }
}