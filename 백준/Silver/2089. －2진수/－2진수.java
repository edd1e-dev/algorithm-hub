

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        if (n == 0) {
            System.out.println(n);
            return;
        }

        while (n != 0) {
            sb.append(Math.abs(n % -2));
            n = (int) Math.ceil((double) n / -2);
        }

        System.out.println(sb.reverse());

        bw.flush();
        br.close();
        bw.close();
    }
}