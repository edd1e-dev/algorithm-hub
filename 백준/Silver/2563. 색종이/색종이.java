
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[][] arr = new boolean[100][100];

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            for (int i = w; i < w + 10; i++) {
                for (int j = h; j < h + 10; j++) {
                    arr[i][j] = true;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j]) result++;
            }
        }

        System.out.println(result);

        bw.flush();
        br.close();
        bw.close();
    }
}