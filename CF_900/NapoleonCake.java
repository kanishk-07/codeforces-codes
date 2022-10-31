import java.io.*;
//import java.util.*;

public class NapoleonCake {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split("\\s+");
            int[] arr = new int[n], ans = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int temp = arr[n-1];
            for(int i=n-1;i>=0;i--) {
                if(temp!=0 || arr[i]!=0) {
                    ans[i] = 1;
                    temp = Math.max(temp, arr[i]);
                    temp--;
                } else {
                    temp = arr[i];
                }
            }
            for (int i=0; i<n; i++) {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}