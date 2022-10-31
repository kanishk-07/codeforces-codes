import java.io.*;
import java.util.*;

public class Squares {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]), k = Integer.parseInt(str[1]);
        str = br.readLine().split("\\s+");
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<(n/2);i++) {
            int tmp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = tmp;
        }
        // for(int i=0;i<n;i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        if (k>n) {
            System.out.println("-1");
        }
        else {
            System.out.println(arr[k-1]+" 0");
        }
    }
}