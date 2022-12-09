
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] dp = new int[1001];

        dp[1] = 1; dp[2] = 2;
        for (int i = 3; i < 1001; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        int n = Integer.parseInt(br.readLine());

        System.out.println(dp[n]);

        bw.flush();
        br.close();
        bw.close();
    }
}