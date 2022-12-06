
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[1_000_001];

        for (int i = 0; i <= 1000000; i++) {
            arr[i] = true;
        }

        arr[0] = arr[1] = false;

        for (int i = 2; i <= 1000000; i++) {
            if (arr[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    arr[j] = false;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int result = 0;
            for (int i = 2; i <= N / 2; i++) {
                if (arr[i] && arr[N - i]) {
                    result++;
                }
            }
            System.out.println(result);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}