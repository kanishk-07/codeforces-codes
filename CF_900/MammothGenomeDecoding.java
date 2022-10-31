import java.io.*;
//import java.util.*;

public class MammothGenomeDecoding {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), a = 0, g = 0, c = 0, t = 0;
        String str = br.readLine();
        char[] s = str.toCharArray();
        if (n % 4 != 0) {
            System.out.println("===");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (s[i] == 'A')
                a++;
            else if (s[i] == 'G')
                g++;
            else if (s[i] == 'C')
                c++;
            else if (s[i] == 'T')
                t++;
        }

        n /= 4;

        if (a <= n && g <= n && c <= n && t <= n) {
            a = Math.abs(a - n);
            g = Math.abs(g - n);
            c = Math.abs(c - n);
            t = Math.abs(t - n);

            for (int i = 0; i < s.length; i++) {
                if (s[i] == '?') {
                    if (a > 0) {
                        System.out.print("A");
                        a--;
                    } else if (g > 0) {
                        System.out.print("G");
                        g--;
                    } else if (c > 0) {
                        System.out.print("C");
                        c--;
                    } else if (t > 0) {
                        System.out.print("T");
                        t--;
                    }
                } else
                    System.out.print(s[i]);
            }

            System.out.println();
        } else
            System.out.println("===");
    }
}