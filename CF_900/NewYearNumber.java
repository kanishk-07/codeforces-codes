import java.io.*;
//import java.util.*;

public class NewYearNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine());
            while(n>2020 && n%2020!=0) {
                n-=2021;
            }
            if(n%2020==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}