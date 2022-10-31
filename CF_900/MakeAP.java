import java.io.*;

public class MakeAP {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t--> 0) {
            String[] str = br.readLine().split("\\s+");
            int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]), c = Integer.parseInt(str[2]);
            if ((2 * b - c > 0) && (2 * b - c) % a == 0)
                System.out.println("YES");
            else if ((a + c) % (2 * b) == 0)
                System.out.println("YES");
            else if ((2 * b - a > 0) && (2 * b - a) % c == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}