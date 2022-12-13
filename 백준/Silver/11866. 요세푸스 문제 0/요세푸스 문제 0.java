
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        int index = 1;
        while(!q.isEmpty()) {
            if (index == k) {
                list.add(q.poll());
                index = 1;
            } else {
                q.offer(q.poll());
                index++;
            }
        }

        System.out.print("<");
        for (int i = 0; i < list.size();) {
            System.out.print(list.get(i));
            if (++i < list.size()) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
