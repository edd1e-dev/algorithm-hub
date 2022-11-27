
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for (char c : str.toCharArray()) {
            left.push(c);
        }

        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            String s = bf.readLine();

            if (s.charAt(0) == 'L') {
                if (!left.isEmpty()) right.push(left.pop());
            } else if (s.charAt(0) == 'D') {
                if (!right.isEmpty()) left.push(right.pop());
            } else if (s.charAt(0) == 'B') {
                if (!left.isEmpty()) left.pop();
            } else if (s.charAt(0) == 'P') {
                left.push(s.charAt(2));
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        StringBuilder sb = new StringBuilder();

        while(!right.isEmpty()) {
            sb.append(right.pop());
        }

        System.out.println(sb.toString());
    }
}
