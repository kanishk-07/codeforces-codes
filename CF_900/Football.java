import java.io.*;
//import java.util.*;

public class Football {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.indexOf("0000000")==-1 && str.indexOf("1111111")==-1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}