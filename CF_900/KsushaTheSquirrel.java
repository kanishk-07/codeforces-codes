import java.io.*;
//import java.util.*;

public class KsushaTheSquirrel {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split("\\s+"), ans = "NO";
        int n = Integer.parseInt(str[0]), k = Integer.parseInt(str[1]), currSector = 0;
        char[] arr = br.readLine().toCharArray();
        if(arr[0]=='#' || arr[n-1]=='#') {
            System.out.println(ans);
            return;
        }
        while(currSector<n-1) {
            int next = currSector+k < n ? currSector+k : n-1;
            while(arr[next]=='#') {
                next--;
            }
            if(next<=currSector) {
                System.out.println(ans);
                return;
            }
            currSector = next;
        }
        System.out.println("YES");
    }
}