
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        IntStream.range(1, n + 1).forEach(i -> queue.add(i));

        int cnt = 1;
        while (!queue.isEmpty()) {
            if (cnt == k) {
                result.add(queue.poll());
                cnt = 0;
            } else {
                queue.add(queue.poll());
            }
            cnt++;
        }

        System.out.print("<");
        for (int i = 0; i < result.size();) {
            System.out.print(result.get(i));
            if (++i < result.size()) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
