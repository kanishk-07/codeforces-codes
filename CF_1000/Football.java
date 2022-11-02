import java.util.Arrays;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] teams = new String[n];
        String[] names = new String[2];
        int[] goals = new int[2];
        for (int i = 0; i < n; i++)
            teams[i] = in.next();
        Arrays.sort(teams);
        names[0] = teams[0];
        for (int i = 0; i < teams.length; i++) {
            if (teams[i].compareTo(names[0]) == 0)
                goals[0]++;
            else {
                names[1] = teams[i];
                break;
            }
        }
        goals[1] = n - goals[0];
        if (goals[0] > goals[1])
            System.out.println(names[0]);
        else
            System.out.println(names[1]);
        in.close();
    }

}