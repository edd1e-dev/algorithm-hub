
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;

        while ((input = br.readLine()) != null) {
            int[] count = new int[4];
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c >= 'a' && c <= 'z') {
                    count[0]++;
                } else if (c >= 'A' && c <= 'Z') {
                    count[1]++;
                } else if (c >= '0' && c <= '9') {
                    count[2]++;
                } else if (c == ' ') {
                    count[3]++;
                }
            }

            for (int n : count) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}