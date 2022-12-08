
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";
        loop:
        while ((str = br.readLine()) != null) {
            if (str.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.empty() || stack.peek() != '(') {
                        System.out.println("no");
                        continue loop;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.empty() || stack.peek() != '[') {
                        System.out.println("no");
                        continue loop;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (stack.empty()) System.out.println("yes");
            else System.out.println("no");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
