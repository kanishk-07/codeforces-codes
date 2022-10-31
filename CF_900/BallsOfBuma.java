import java.io.*;
// import java.util.*;

public class BallsOfBuma {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int n = str.length, ran = 0;
        int[] val = new int[n];
        int[] ara = new int[n];
        for(int i=0;i<n;)
    {
       int cnt=0,j;
       for(j=i;j<n&&str[i]==str[j];j++)
       {
          cnt++;
       }
       ara[ran]=str[i]-64;
       val[ran++]=cnt;
       i=j;
    }
    if(ran%2==0)
    {
       System.out.println("0");
       return;
    }
  //  cout<<ran<<endl;
    int g=ran/2;
  //  cout<<val[g]<<endl;
    if(val[g]>=2)
    {
        int ans=func(val, ara, ran, g-1,g+1)*(val[g]+1);
        System.out.println(ans);
        return;
    }
    System.out.println(0);

    }
    static int func(int[] val, int[] ara, int ran, int pos,int pos2)
    {
       if(pos<0&&pos2>=ran)return 1;
       if(pos<0)return 0;
       if(pos2>=ran)return 0;
       if(ara[pos]!=ara[pos2])return 0;
       if(val[pos]+val[pos2]<=2)return 0;
       return func(val, ara, ran, pos-1,pos2+1);
    }
}