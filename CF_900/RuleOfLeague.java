import java.io.*;
//import java.util.*;

public class RuleOfLeague {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            String[] str = br.readLine().split("\\s+");
            int n = Integer.parseInt(str[0])-1, x = Integer.parseInt(str[1]), y = Integer.parseInt(str[2]);
            if(x==0 && y==0) {
                System.out.println(-1);
                continue;
            } else if (x!=0 && y!=0) {
                System.out.println(-1);
                continue;
            }
            int nonZero = (x==0)?y:x, player = 1;
            if((n%nonZero)!=0) {
                System.out.println(-1);
                continue;
            }
            for(int i=0;i<n;i++) {
                if(i>0 && player==1 && i%nonZero==0)
                    player+=(nonZero+1);
                else if(i>0 && i%nonZero==0)
                    player+=nonZero;
                System.out.print(player+" ");
            }
            System.out.println();
        }
    }
}