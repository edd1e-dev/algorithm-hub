
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean[] prime = new boolean[arr[1] + 1];

        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }

        prime[0] = prime[1] = false;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (!prime[i]) continue;

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = false;
            }
        }

        for (int i = arr[0]; i <= arr[1]; i++) {
            if (prime[i]) System.out.println(i);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}