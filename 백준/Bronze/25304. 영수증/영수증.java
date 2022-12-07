
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long x = Long.parseLong(br.readLine());

        int n = Integer.parseInt(br.readLine());

        long result = 0;
        while (n-- > 0) {
            long[] arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

            long a = arr[0];
            long b = arr[1];

            result += a * b;
        }

        System.out.println(x == result ? "Yes" : "No");

        bw.flush();
        br.close();
        bw.close();
    }
}