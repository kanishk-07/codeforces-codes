import java.io.*;
//import java.util.*;

public class NewYearCandles {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]), hrs = a;
        while(a>=b) {
            hrs += (a/b);
            a = (a/b) + (a%b);
        }
        System.out.println(hrs);
    }
}