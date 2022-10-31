import java.io.*;
//import java.util.*;

public class AlmostTernaryMatrix {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]); // given they are even
            int[][] stamp = new int[][]{{1,0,0,1}, {0,1,1,0}, {0,1,1,0}, {1,0,0,1}};
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    System.out.print(stamp[i%4][j%4] +" ");
                }
                System.out.println();
            }
        }
    }
}