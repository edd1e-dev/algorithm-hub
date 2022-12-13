

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        boolean b = false;
        while (!q.isEmpty() && q.size() > 1) {
            if (b == false) q.poll();
            else q.offer(q.poll());

            b = !b;
        }

        System.out.println(q.poll());
    }
}
