import java.io.*;
//import java.util.*;

public class DivMod {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int l = Integer.parseInt(str[0]), r = Integer.parseInt(str[1]), a = Integer.parseInt(str[2]);
            if(l/a == r/a) {
                System.out.println( (r/a + r%a) );
            } else {
                System.out.println( Math.max((r/a)+(r%a), (r/a -1)+(a-1)) );
            }
        }
    }
}