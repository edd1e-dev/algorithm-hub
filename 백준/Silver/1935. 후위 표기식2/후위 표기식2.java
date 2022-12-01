

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] prefix = br.readLine().toCharArray();
        int arr[] = new int[n];
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] >= 'A' && prefix[i] <= 'Z') {
                stack.push((double) arr[prefix[i] - 'A']);
            } else {
                Double one = stack.pop();
                Double two = stack.pop();
                double result = 0.0;

                if (prefix[i] == '+') {
                    result = two + one;
                } else if (prefix[i] == '-') {
                    result = two - one;
                } else if (prefix[i] == '*') {
                    result = two * one;
                } else if (prefix[i] == '/') {
                    result = two / one;
                }

                stack.push(result);
            }
        }

        System.out.println(String.format("%.2f",stack.pop()));
    }
}