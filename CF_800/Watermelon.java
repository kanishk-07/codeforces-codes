import java.io.*;

public class Watermelon {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==2)
            System.out.println("NO");
        else if(n%2==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
