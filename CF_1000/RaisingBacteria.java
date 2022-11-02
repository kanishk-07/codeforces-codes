import java.io.*;
//import java.util.*;

public class RaisingBacteria {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine()), count = 0;
        while (x / 2 != 0) {
            if (x % 2 == 1)
                count++;
            x = x / 2;
        }
        System.out.println(count + 1);
    }
}