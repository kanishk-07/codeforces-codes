import java.io.*;
import java.util.*;

public class Shooting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), sum = 0;
        String[] str = br.readLine().split("\\s+");
        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++) {
            arr[i][0] = Integer.parseInt(str[i]);
            arr[i][1] = i+1;
        }
        Arrays.sort(arr, (a,b)->(b[0]-a[0]));
        for(int i=0;i<n;i++) {
            sum += (arr[i][0]*(i) + 1);
        }
        System.out.println(sum);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i][1] + " ");
        }
    }
}