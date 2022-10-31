import java.io.*;
//import java.util.*;

public class MargariteBestPresent {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String[] str = br.readLine().split("\\s+");
            long l = Long.parseLong(str[0]), r = Long.parseLong(str[1]);
            long ans = 0, diff = r-l;
            if(l%2==1 && r%2==1) {
                ans = (diff/2)-r;
            } else if(l%2==0 && r%2==0) {
                ans = (-diff/2)+r;
            } else if(l%2==1 && r%2==0) {
                ans = (diff+1)/2;
            } else {
                ans = -1*((diff+1)/2);
            }
            System.out.println(ans);
        }
    }
}