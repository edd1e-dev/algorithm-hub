
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            boolean isLeft = true;
            boolean isError = false;
            Deque<Integer> deque = new LinkedList<>();

            String str = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String data = br.readLine();

            if (!data.equals("[]")) {
                int[] input = Arrays.stream(data.substring(1, data.length() - 1)
                                .split(","))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                Arrays.stream(input).forEach(i -> deque.offer(i));
            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == 'R') isLeft = !isLeft;
                else if (c == 'D') {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }

                    if (isLeft == true) deque.pollFirst();
                    else deque.pollLast();
                }
            }

            if (isError) {
                System.out.println("error");
            } else {
                StringBuilder sb = new StringBuilder("[");
                while (!deque.isEmpty()) {
                    sb.append(isLeft ? deque.pollFirst() : deque.pollLast());
                    if (deque.size() != 0) sb.append(",");
                }
                sb.append("]");
                System.out.println(sb);
            }

        }
    }
}
