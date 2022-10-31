import java.io.*;
//import java.util.*;

public class Mul2Div6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine()), p2 = 0, p3 = 0;
            while(n%2==0) {
                p2++;
                n/=2;
            }
            while(n%3==0) {
                p3++;
                n/=3;
            }
            if(n!=1 || p2>p3)
                System.out.println(-1);
            else {
                System.out.println((2*p3)-p2);
            }
        }
    }
}