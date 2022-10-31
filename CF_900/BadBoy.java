import java.io.*;
//import java.util.*;

public class BadBoy {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]);
            System.out.println("1 1 "+ n +" "+ m);
        }
    }
    static int dis(int x1, int y1, int x2, int y2) {
        return Math.abs(x2-x1) + Math.abs(y2-y1);
    }
}