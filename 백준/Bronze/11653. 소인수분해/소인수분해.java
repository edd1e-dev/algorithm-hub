
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }

        if (n != 1) System.out.println(n);

        bw.flush();
        br.close();
        bw.close();
    }
}