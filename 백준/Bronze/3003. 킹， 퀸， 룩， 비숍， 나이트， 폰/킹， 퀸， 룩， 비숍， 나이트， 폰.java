

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        int[] arr = new int[] {1, 1, 2, 2, 2, 8};

        int[] data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < data.length;) {
            sb.append(arr[i] - data[i]);
            if (++i < data.length) {
                sb.append(" ");
            }
        }

        System.out.println(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}