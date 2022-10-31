import java.io.*;

public class WayTooLongWords {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String str = br.readLine();
            char[] arr = str.toCharArray();
            int l = arr.length;
            if(l<=10) {
                System.out.println(str);
            }
            else {
                String ans = String.valueOf(arr[0]) + String.valueOf(l-2) + String.valueOf(arr[l-1]);
                System.out.println(ans);
            }
        }
    }
}
