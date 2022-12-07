

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();


        int n = arr[0];
        int b = arr[1];

        while (n > 0) {
            if (n % b < 10) {
                sb.append((char) (n % b + '0'));
            } else {
                sb.append((char) ((n % b - 10) + (int) 'A'));
            }
            n = n / b;
        }

        System.out.println(sb.reverse());

        bw.flush();
        br.close();
        bw.close();
    }
}