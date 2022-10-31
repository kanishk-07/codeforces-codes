import java.io.*;
//import java.util.*;

public class TheTime {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        int a = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(time.substring(0, 2)), m = Integer.parseInt(time.substring(3, 5));
        int mi = m + a;
        int hr = mi / 60;
        mi %= 60;
        hr = (h + hr) % 24;
        if(hr < 10 && mi < 10){
            System.out.println("0"+hr+":0"+mi);
        }
        else if(hr >= 10 && mi < 10){
            System.out.println(hr+":0"+mi);
        }
        else if(hr < 10 && mi >= 10){
            System.out.println("0"+hr+":"+mi);
        }
        else{
            System.out.println(hr+":"+mi);
        }
    }
}