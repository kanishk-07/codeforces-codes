import java.io.*;
import java.util.*;

public class ArrayEversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
            HashSet<Integer> set = new HashSet<>();
            String[] str = br.readLine().split("\\s+");
            int[] arr = new int[n];
            int[] maxes = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(str[i]);
                max = Math.max(max, arr[i]);
            }
            for(int i=n-1;i>=0;i--) {
                if(arr[i]==max)
                    break;
                if(i==n-1) {
                    maxes[i] = arr[i];
                } else {
                    maxes[i] = Math.max(maxes[i+1], arr[i]);
                }
                set.add(maxes[i]);
            }
            System.out.println(set.size());
        }
    }
}