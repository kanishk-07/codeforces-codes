import java.io.*;
import java.util.*;

public class ArrayReodering {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()), ans = 0;
            String[] str = br.readLine().split("\\s+");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            ArrayList<Integer> even = new ArrayList<>();
            for(int i : arr) {
                if(i%2==0)
                    even.add(i);
            }
            ArrayList<Integer> odd = new ArrayList<>();
            for(int i : arr) {
                if(i%2==1)
                    odd.add(i);
            }
            int p = 0;
            while(p<even.size()) {
                arr[p] = even.get(p++);
            }
            int q=p;
            p=0;
            while(p<odd.size()) {
                arr[q+p] = odd.get(p++);
            }
            for (int i = 0;i<n;i++) {
                for(int j=i+1;j<n;j++) {
                    if(gcd(arr[i], 2*arr[j])>1)
                        ans++;
                }
            }
            System.out.println(ans);
        }
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}