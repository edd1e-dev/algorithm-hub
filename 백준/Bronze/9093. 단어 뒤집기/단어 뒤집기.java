import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행문자 초기화

        Stack stack = new Stack();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();

            for (char c : s.toCharArray()) {
                if (c == ' ') {
                    while (stack.size() > 0) {
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                } else {
                    stack.push(c);
                }
            }
            while (stack.size() > 0) {
                sb.append(stack.pop());
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}