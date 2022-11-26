import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행문자 초기화

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            Stack stack = new Stack();
            String s = sc.nextLine();
            for (char c : s.toCharArray()) {
                if (stack.isEmpty()) {
                    if (c == ')') {
                        stack.push(')');
                        break;
                    }
                }

                if (c == '(') {
                    stack.push('(');
                } else {
                    stack.pop();
                }
            }

            if (stack.size() > 0) sb.append("NO\n");
            else sb.append("YES\n");
        }

        System.out.println(sb.toString());

    }
}