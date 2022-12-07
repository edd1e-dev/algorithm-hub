

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[10_001];

        for (int i = 0; i < 10001; i++) {
            arr[i] = true;
        }

        arr[0] = arr[1] = false;

        for (int i = 2; i < Math.sqrt(10001); i++) {
            if (arr[i]) {
                for (int j = i * i; j < 10001; j += i) {
                    arr[j] = false;
                }
            }
        }

        int sum = 0;
        int min = 0;
        for (int i = m; i <= n; i++) {
            if (arr[i]) {
                sum += i;
                if (min == 0) {
                    min = i;
                }
            }
        }

        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}