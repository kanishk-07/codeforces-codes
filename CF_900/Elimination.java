import java.io.*;
//import java.util.*;

public class Elimination {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]), d = Integer.parseInt(str[3]);
            System.out.println(Math.max(a+b, c+d));
        }
    }
}