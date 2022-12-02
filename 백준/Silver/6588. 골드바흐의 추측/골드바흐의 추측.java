
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] prime = new boolean[1000001];

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

        String input;

        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            boolean isGold = false;

            if (n == 0) {
                break;
            }

            for (int i = 2; i <= n/2; i++) {
                if (prime[i] && prime[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    isGold = true;
                    break;
                }
            }

            if (!isGold) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}