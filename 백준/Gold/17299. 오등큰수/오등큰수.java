
import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int arr[] = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();


        int cnt[] = new int[1000001];
        int index[] = new int[1000001];

        for (int i = 0; i < n; i++) {
            cnt[arr[i]]++; // cnt배열 값 증가
            index[arr[i]] = arr[i]; // 인덱스 받은 값으로 채우기
        }

        stack.push(0);
        for (int i = 1; i < n; i++) {
            if (stack.empty()) {
                stack.push(i);
            }

            while (!stack.empty() && cnt[arr[stack.peek()]] < cnt[arr[i]]) {
                arr[stack.peek()] = arr[i];
                stack.pop();
            }

            stack.push(i);
        }

        while (!stack.empty()) {
            arr[stack.pop()] = -1;
        }

        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}