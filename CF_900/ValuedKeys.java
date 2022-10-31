import java.io.*;
//import java.util.*;

public class ValuedKeys {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray(), b = br.readLine().toCharArray();
        String c = "";
        int l = a.length;
        for (int i = 0; i < l; i++) {
            if (a[i] == b[i])
                c = c + String.valueOf(a[i]);
            else if (a[i] > b[i])
                c = c + String.valueOf((a[i]<b[i]?a[i]:b[i]));
            else {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(c);
    }
}