import java.io.*;
//import java.util.*;

public class Game01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String str = br.readLine();
            char[] arr = str.toCharArray();
            int c0=0, c1=0;
            for(char i : arr) {
                if (i=='0')
                    c0++;
                else if (i=='1')
                    c1++;
            }
            int ans = Math.min(c0, c1);
            if(ans%2==0)
                System.out.println("NET");
            else
                System.out.println("DA");
        }
    }
}