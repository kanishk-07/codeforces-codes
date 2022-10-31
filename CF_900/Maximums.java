import java.io.*;
//import java.util.*;

public class Maximums {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), xi = 0;
        String[] str = br.readLine().split("\\s+");
        for (int i=0; i<n; i++) {
            int bi = Integer.parseInt(str[i]);
            int ai = bi+xi;
            System.out.print(ai + " ");
            xi = Math.max(xi, ai);
        }
    }
}