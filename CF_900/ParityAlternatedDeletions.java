import java.io.*;
import java.util.*;

public class ParityAlternatedDeletions {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("\\s+");
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(str[i]);
            if((num&1)==0)
                even.add(num);
            else
                odd.add(num);
        }
        int evenIndex = even.size()-1, oddIndex = odd.size()-1;
        if(Math.abs(evenIndex-oddIndex)<2) {
            System.out.println(0);
            return;
        }
        Collections.sort(even);
        Collections.sort(odd);
        if(evenIndex<oddIndex) {
            int ans = 0;
            for(int i=oddIndex-evenIndex-2;i>=0;i--) {
                ans+=odd.get(i);
            }
            System.out.println(ans);
        } else if (evenIndex>oddIndex) {
            int ans = 0;
            for(int i=evenIndex-oddIndex-2;i>=0;i--) {
                ans+=even.get(i);
            }
            System.out.println(ans);
        }
    }
}