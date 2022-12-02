
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

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int gcd = gcd(arr[0], arr[1]);
            System.out.println(lcm(arr[0] * arr[1], gcd));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}