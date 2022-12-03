
import java.io.*;
import java.util.*;

public class Main {
    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd (b, a % b);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            long[] arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
            long sum = 0;

            for (int i = 1; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    sum += gcd(arr[i], arr[j]);
                }
            }

            System.out.println(sum);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}