
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int length = str.length();
        int N = Integer.parseInt(str);

        int result = 0;
        for (int i = N - length * 9; i < N; i++) {
            int temp = i;
            int sum = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
