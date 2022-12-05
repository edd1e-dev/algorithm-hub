import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        String[] arr_front = new String[] {"0", "1", "10", "11", "100", "101", "110", "111"};
        String[] arr_back = new String[] {"000", "001", "010", "011", "100", "101", "110", "111"};

        for (int i = 0; i < s.length(); i++) {
            int num = Integer.parseInt(s.substring(i, i + 1));

            if (i == 0) {
                sb.append(arr_front[num]);
            } else {
                sb.append(arr_back[num]);
            }
        }

        System.out.println(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}