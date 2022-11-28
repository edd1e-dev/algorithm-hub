

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();

        char[] chars = br.readLine().toCharArray();

        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push('(');
            } else {
                if (chars[i] == ')') {
                    stack.pop();

                    if (chars[i - 1] == '(') {
                        result += stack.size();
                    } else {
                        result++;
                    }
                }
            }
        }

        bw.write(String.valueOf(result));

        bw.flush();
        br.close();
        bw.close();
    }
}
