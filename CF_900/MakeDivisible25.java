import java.io.*;
//import java.util.*;

public class MakeDivisible25 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String n = br.readLine();
            long ans = Long.MAX_VALUE;
            ans = Math.min(ans, make(n, '0', '0'));
            ans = Math.min(ans, make(n, '2', '5'));
            ans = Math.min(ans, make(n, '5', '0'));
            ans = Math.min(ans, make(n, '7', '5'));
            System.out.println(ans);
        }
    }
    static long make(String s, char a, char b) {
        char[] arr = s.toCharArray();
        int n = arr.length, index1 = n, index2 = n;
        for(int i=n-1; i>=0; i--) {
            if(arr[i]==b && index1==n)
                index1 = i;
            else if(arr[i]==a && index1!=n) {
                index2 = i;
                break;
            }
        }
        if(index2!=n)
            return (n-index1-1) + (index1-index2-1);
        return Long.MAX_VALUE;
    }
}