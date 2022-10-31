import java.io.*;
//import java.util.*;

public class NonSubstringSubsequence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            long n = Long.parseLong(str[0]), q = Long.parseLong(str[1]);
            String s = br.readLine();
            char[] ch = s.toCharArray();
            for (int i=0; i<q; i++) {
                str = br.readLine().split("\\s+");
                String ans = "NO";
                int l = Integer.parseInt(str[0]) - 1, r = Integer.parseInt(str[1]) - 1;
                for(int j=0;j<l;j++) {
                    if(ch[j]==ch[l]) {
                        ans = "YES";
                        break;
                    }
                }
                for(int j=r+1;j<n;j++) {
                    if(ch[j]==ch[r]) {
                        ans = "YES";
                        break;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}