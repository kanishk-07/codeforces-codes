import java.io.*;
//import java.util.*;

public class KanaDragonQuest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int x = Integer.parseInt(str[0]), n = Integer.parseInt(str[1]), m = Integer.parseInt(str[2]);
            while(n-->0 && x>20) {
                    x = (x/2)+10;
            }
            while(m-->0 && x>0) {
                x-=10;
            }
            if(x<=0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}