import java.io.*;
//import java.util.*;

public class ConstructTheString {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int n = Integer.parseInt(str[0]), a = Integer.parseInt(str[1]), b = Integer.parseInt(str[2]);
            char[] ans = new char[n];
            char ch = 'a';
            for(int i=0;i<n;i++) {
                if(i%a==0)
                    ch = 'a';
                ans[i] = ch;
                if(i%a<b-1)
                    ch++;
            }
            System.out.println(new String(ans));
        }
    }
}