import java.io.*;
//import java.util.*;

public class MisloveLostArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]), l = Integer.parseInt(str[1]), r = Integer.parseInt(str[2]);
        long min = n-l+1, max = 0;
        long copy = min, next = 2;
        while(copy<n) {
            min+=next;
            next*=2;
            copy++;
        }
        next = 1;
        copy = 0;
        while(copy<n) {
            max+=next;
            if(copy<r-1) {
                next*=2;
            }
            copy++;
        }
        System.out.println(min+" "+ max);
    }
}