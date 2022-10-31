import java.io.*;
//import java.util.*;

public class Team {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), ans = 0;
        for(int i=0;i<n;i++) {
            String str[] = br.readLine().split("\\s+");
            int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]), c = Integer.parseInt(str[2]);
            if( (a==1 && b==1) || (a==1 && c==1) || (b==1 && c==1) ) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}