
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        while (n-- > 0) {
            int i = Integer.parseInt(br.readLine());

            if (i == 0) {
                if (!stack.empty()) stack.pop();
            } else {
                stack.push(i);
            }
        }

        if (stack.empty()) {
            System.out.println(0);
        } else {
            int result = 0;
            while (!stack.empty()) {
                result += stack.pop();
            }
            System.out.println(result);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}