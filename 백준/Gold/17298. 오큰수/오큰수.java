

import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int[] ans = new int[n];


        for (int i = n - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.empty()) ans[i] = -1;
            else ans[i] = stack.peek();

            stack.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            bw.write(ans[i] + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
