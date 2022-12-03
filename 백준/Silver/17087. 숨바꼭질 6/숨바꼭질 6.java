
import java.io.*;
import java.util.*;

public class Main {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd (b, a % b);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];
        int s = arr[1];

        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Math.abs(arr[i] - s);
        }

        int gcd = a[0];
        for (int i = 1; i < a.length; i++) {
            gcd = gcd(gcd, a[i]);
        }

        System.out.println(gcd);

        bw.flush();
        br.close();
        bw.close();
    }
}