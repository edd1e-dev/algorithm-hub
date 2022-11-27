
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int last = 0;

        while (n-- > 0) {
            int value = Integer.parseInt(bf.readLine());

            if (value > last) {
                for (int i = last + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append("+\n");
                }
                last = value;
            } else {
                if (stack.peek() != value) {
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb.toString());
    }
}
