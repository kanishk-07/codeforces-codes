import java.io.*;
//import java.util.*;

public class FoodBuying {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine()), ans = 0;
            while(n>=10) {
                int toSpend = 10*(n/10);
                ans += toSpend;
                n = (toSpend/10) + (n-toSpend);
            }
            ans+=n;
            System.out.println(ans);
        }
    }
}