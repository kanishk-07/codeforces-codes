import java.io.*;
//import java.util.*;

public class HQ9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        int n = arr.length;
        for(int i=0;i<n;i++) {
            if(arr[i]=='H' || arr[i]=='Q' || arr[i]=='9') {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}