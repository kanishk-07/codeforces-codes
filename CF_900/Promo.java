import java.io.*;
import java.util.Arrays;

public class Promo {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]), q = Integer.parseInt(str[1]);
        str = br.readLine().split("\\s+");
        long[] arr = new long[n], cumSum = new long[n];
        for (int i=0; i<n; i++) {
            arr[i] = Long.parseLong(str[i]);
        }
        Arrays.sort(arr);
        cumSum[0] = arr[0];
        for (int i=1; i<n; i++) {
            cumSum[i] = arr[i] + cumSum[i-1];
        }
        while(q-->0) {
            str = br.readLine().split("\\s+");
            int x = Integer.parseInt(str[0]), y = Integer.parseInt(str[1]);
            System.out.println((cumSum[n-x+y-1]-(n-x-1>=0?cumSum[n-x-1]:0)));
        }
    }
}