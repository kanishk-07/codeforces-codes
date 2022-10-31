import java.io.*;
//import java.util.*;

public class MochaRedBlue {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            char[] arr = str.toCharArray(), ans = new char[n];
            if (arr[0] == '?') {
                int ind = -1;
                for (int i = 1; i < n; i++) {
                    if (arr[i] != '?') {
                        ind = i;
                        break;
                    }
                }
                if (ind == -1) {
                    for (int i = 0; i < n; i++) {
                        if ((i & 1) == 1)
                            ans[i] = 'B';
                        else
                            ans[i] = 'R';
                    }
                    System.out.println(new String(ans));
                    continue;
                }
                if (ind % 2 == 0)
                    ans[0] = arr[ind];
                else
                    ans[0] = arr[ind] == 'B' ? 'R' : 'B';
            } else {
                ans[0] = arr[0];
            }
            for (int i = 1; i < n; i++) {
                if (arr[i] == '?')
                    ans[i] = (ans[i - 1] == 'B' ? 'R' : 'B');
                else
                    ans[i] = arr[i];
            }
            System.out.println(new String(ans));
        }
    }
}