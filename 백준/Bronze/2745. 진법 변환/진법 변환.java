

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                result = result * b + ((c - 'A') + 10);
            } else {
                result = result * b + (c - '0');
            }
        }

        System.out.println(result);

        bw.flush();
        br.close();
        bw.close();
    }
}