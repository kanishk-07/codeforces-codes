import java.io.*;
import java.util.*;

public class NetworkConfiguration {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]), k = Integer.parseInt(str[1]);
        str = br.readLine().split("\\s+");
        int[] arr = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(str[i]);
            if(k-->0) {
                pq.add(arr[i]);
            } else if (arr[i]>pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.poll());
    }
}