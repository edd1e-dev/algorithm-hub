
import java.io.*;
import java.util.*;

public class Main {
    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }

    public static int lcm(int n, int m) {
        return n / m;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int gcd = gcd(n[0], n[1]);
        System.out.println(gcd);
        System.out.println(lcm(n[0] * n[1], gcd));

        bw.flush();
        br.close();
        bw.close();
    }
}