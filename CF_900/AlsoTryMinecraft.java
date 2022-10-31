import java.io.*;
//import java.util.*;

public class AlsoTryMinecraft {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]);
        str = br.readLine().split("\\s+");
        long[] arr = new long[n];
        long[] forward = new long[n];
        long[] backward = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(str[i]);
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i])
                forward[i] = forward[i - 1] + arr[i - 1] - arr[i];
            else
                forward[i] = forward[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i + 1] > arr[i])
                backward[i] = backward[i + 1] + arr[i + 1] - arr[i];
            else
                backward[i] = backward[i + 1];
        }
        for (int i = 0; i < m; i++) {
            str = br.readLine().split("\\s+");
            int s = Integer.parseInt(str[0]) - 1, t = Integer.parseInt(str[1]) - 1;
            if(s==t)
                System.out.println(0);
            else if(s<t)
                System.out.println(forward[t]-forward[s]);
            else
                System.out.println(backward[t]-backward[s]);
        }
    }
}