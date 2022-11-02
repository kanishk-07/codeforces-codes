import java.io.*;
import java.util.*;

public class NewYearTransportation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]), t = Integer.parseInt(str[1]) - 1, curr = 0;
        str = br.readLine().split("\\s+");
        int[] arr = new int[Math.max(n, t) + 100];
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<n-1; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        while(true) {
            if(set.contains(curr)) {
                break;
            }
            if(curr==t) {
                System.out.println("YES");
                return;
            }
            set.add(curr);
            curr = curr + arr[curr];
        }
        System.out.println("NO");
    }
}