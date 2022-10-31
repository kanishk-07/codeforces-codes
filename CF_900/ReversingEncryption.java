import java.io.*;
//import java.util.*;

public class ReversingEncryption {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char arr[] = s.toCharArray();
        for(int i=2;i<=n;i++) {
            if(n%i==0) {
                reverse(arr, i);
            }
        }
        System.out.println(new String(arr));
    }
    static void reverse(char[] arr, int n) {
        for(int i=0;i<(n/2);i++) {
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        //System.out.println(new String(arr));
    }
}