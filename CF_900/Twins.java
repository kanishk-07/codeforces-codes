import java.io.*;
import java.util.*;

public class Twins {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), ans = 0, sum = 0, currSum = 0;
        String[] str = br.readLine().split("\\s+");
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(str[i]);
            sum+=arr[i];
        }
        sum = sum/2;
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--) {
            if(currSum<=sum) {
                currSum+=arr[i];
                ans++;
            }
            else {
                break;
            }
        }
        System.out.println(ans);
    }
}