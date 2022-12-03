
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = arr[0];
        int m = arr[1];

        int cnt2 = get(n, 2) - get(m, 2) - get(n - m, 2);
        int cnt5 = get(n, 5) - get(m, 5) - get(n - m, 5);

        System.out.println(Math.min(cnt2, cnt5));

        bw.flush();
        br.close();
        bw.close();
    }

    static int get(int a, int b) {
        int cnt = 0;

        while (a >= b) {
            cnt += a / b;
            a /= b;
        }

        return cnt;
    }
}