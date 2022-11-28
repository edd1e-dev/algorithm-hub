

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean tag = false;

        Stack<Character> stack = new Stack<>();
        char[] chars = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++)  {
            if (chars[i] == '<') {
                tag = true;
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            } else if (chars[i] == '>') {
                tag = false;
                sb.append(chars[i]);
                continue;
            }

            if (tag == true) {
                sb.append(chars[i]);
            } else {
                if (chars[i] == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                } else {
                    stack.push(chars[i]);
                }

                if (i == chars.length - 1) {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                }
            }
        }

        System.out.println(sb.toString());
    }
}
