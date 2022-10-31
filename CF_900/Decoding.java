import java.io.*;
//import java.util.*;

public class Decoding {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), step = 0;
        String str = br.readLine(), ans = "";
        char[] arr = str.toCharArray();
        for(int i=0;i<n;i++) {
            char ch = arr[i];
            if (n%2==0 && step%2==0) {
                ans = String.valueOf(ch) + ans;
            } else if (n%2==0 && step%2==1) {
                ans = ans + String.valueOf(ch);
            } else if (n%2==1 && step%2==0) {
                ans = ans + String.valueOf(ch);
            } else if (n%2==1 && step%2==1) {
                ans = String.valueOf(ch) + ans;
            }
            step++;
        }
        System.out.println(ans);
    }
}