import java.io.*;
//import java.util.*;

public class PermutationSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine()), sorted = 1;
            String[] str = br.readLine().split("\\s+");
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(str[i]);
                if(arr[i]!=i+1)
                    sorted = 0;
            }
            if(sorted==1)
                System.out.println(0);
            else if(arr[0]==1 || arr[n-1]==n)
                System.out.println(1);
            else if(arr[0]==n && arr[n-1]==1)
                System.out.println(3);
            else
                System.out.println(2);
        }
    }
}