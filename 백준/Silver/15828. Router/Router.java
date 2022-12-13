

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int curSize = 0;
        Queue<Integer> q = new LinkedList<>();

        String str = "";
        while ((str = br.readLine()) != null) {
            int value = Integer.parseInt(str);

            if (value == -1) break;

            if (value == 0) {
                if (!q.isEmpty()) {
                    q.poll();
                    curSize--;
                }
            } else {
                if (curSize == size) continue;
                q.offer(value);
                curSize++;
            }
        }


        if (q.isEmpty()) System.out.println("empty");
        else {
            while (!q.isEmpty()) {
                System.out.print(q.poll() + " ");
            }
        }
    }
}
