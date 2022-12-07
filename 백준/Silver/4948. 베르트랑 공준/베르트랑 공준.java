
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[246914];

        for (int i = 0; i < 246914; i++) {
            arr[i] = true;
        }

        arr[0] = arr[1] = false;

        for (int i = 2; i < Math.sqrt(246914); i++) {
            if (arr[i]) {
                for (int j = i * i; j < 246914; j += i) {
                    arr[j] = false;
                }
            }
        }

        String str;
        while ((str = br.readLine()) != null) {
            int one = Integer.parseInt(str);
            int two = one * 2;
            int result = 0;

            for (int i = one + 1; i <= two; i++) {
                if (arr[i]) {
                    result++;
                }
            }

            if (one != 0)
            System.out.println(result);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}