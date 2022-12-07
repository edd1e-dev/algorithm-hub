
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[10001];

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

        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);

            if (!arr[n]) {
                for (int i = n / 2; i >= 0; i--) {
                    if (arr[i] && arr[n - i]) {
                        System.out.println(i + " " + (n - i));
                        break;
                    }
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}