import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            while (true) {
                int index = 0;
                Iterator it = deque.iterator();
                while (it.hasNext()) {
                    if ((int) it.next() == target)
                        break;
                    index++;
                }

                if (index == 0) {
                    deque.pollFirst();
                    break;
                } else if (index > deque.size() / 2) {
                    deque.offerFirst(deque.pollLast());
                    cnt++;
                } else {
                    deque.offerLast(deque.pollFirst());
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
