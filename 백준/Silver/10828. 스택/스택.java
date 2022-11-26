import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("push")) {
                int val = sc.nextInt();
                stack.push(val);
            } else if (s.equals("top")) {
                if (stack.size() > 0) sb.append(stack.peek() + "\n");
                else sb.append(-1 + "\n");
            } else if (s.equals("size")) {
                sb.append(stack.size() + "\n");
            } else if (s.equals("empty")) {
                if (stack.size() > 0) sb.append(0 + "\n");
                else sb.append(1 + "\n");
            } else if (s.equals("pop")) {
                if (stack.size() > 0) sb.append(stack.pop() + "\n");
                else sb.append(-1 + "\n");
            }
        }

        System.out.println(sb.toString());
    }
}