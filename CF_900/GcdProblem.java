import java.io.*;
//import java.util.*;

public class GcdProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            long n = Long.parseLong(br.readLine());
            if(n%2==0) {
                System.out.println((n-3)+" "+2+" "+1);
            } else {
                long m = n-1;
                if((m/2)%2==0) {
                    System.out.println(((m/2)-1)+" "+((m/2)+1)+" "+1);
                } else {
                    System.out.println(((m/2)-2)+" "+((m/2)+2)+" "+1);
                }
            }
        }
    }
}