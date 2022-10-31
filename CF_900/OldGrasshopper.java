import java.io.*;
//import java.util.*;

public class OldGrasshopper {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            long x = Long.parseLong(str[0]), n = Long.parseLong(str[1]), z = 0;
            if (n%4==1)
                z = -n;
            else if (n%4==2)
                z = 1;
            else if (n%4==3)
                z = n+1;
            if ((x&1)==1)
                System.out.println(x-z);
            else
                System.out.println(x+z);
        }
    }
}