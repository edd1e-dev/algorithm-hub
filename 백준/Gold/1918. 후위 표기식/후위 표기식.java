
import java.io.*;
import java.util.*;

public class Main {
    public static int priority(char c) {
        if (c == '(') return 0;
        else if (c == '+' || c == '-') return 1;
        else return 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                result += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.empty()) {
                    char op = stack.pop();
                    if (op == '(') break; // '('를 만날 때까지 스택에서 pop
                    result += op;
                }
            } else {
                while (!stack.empty() && priority(stack.peek()) >= priority(c)) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.empty()) {
            result += stack.pop();
        }

        System.out.println(result);

        bw.flush();
        br.close();
        bw.close();
    }
}