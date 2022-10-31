import java.io.*;
//import java.util.*;

public class TilingChallenge {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] a = new char[n+5][n+5];
        for (int i=0; i<n; i++) {
            a[i] = (br.readLine() + "     ").toCharArray();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i][j] == '.'){
                    if(((j>0 && a[i+1][j-1] == '.') && a[i+1][j+1] == '.') && (a[i+1][j] == '.')){
                        if(a[i+2][j] == '.'){
                            if(i < n && j < n){
                                a[i][j] = a[i+1][j-1] = a[i+1][j] = a[i+1][j+1] = a[i+2][j] = '#';
                            }
                        }
                    }
                }
            }
        }
        boolean ok = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i][j] == '#'){
                    ok = true;
                }
                else{
                    ok = false;
                    break;
                }
            }
            if(ok == false)break;
        }
        if(ok){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}