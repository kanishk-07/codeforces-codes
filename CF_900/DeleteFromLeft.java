import java.io.*;
//import java.util.*;

public class DeleteFromLeft {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine(), t1 = br.readLine();
        char s[] = s1.toCharArray(), t[] = t1.toCharArray();
        int ns = s.length, nt = t.length, i = ns-1, j = nt-1;
        for(i=ns-1, j=nt-1; i>=0 && j>=0; i--, j--) {
            if(s[i]!=t[j])
                break;
        }
        System.out.println(i+j+2);
    }
}