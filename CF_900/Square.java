import java.io.*;
//import java.util.*;

public class Square {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int a1 = Integer.parseInt(str[0]), b1 = Integer.parseInt(str[1]);
            str = br.readLine().split("\\s+");
            int a2 = Integer.parseInt(str[0]), b2 = Integer.parseInt(str[1]);
            if(a1==a2 && b1+b2==a1)
                System.out.println("YES");
            else if(a1==b2 && a2+b1==a1)
                System.out.println("YES");
            else if(b1==a2 && a1+b2==b1)
                System.out.println("YES");
            else if(b1==b2 && a2+a1==b1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}