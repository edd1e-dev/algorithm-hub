
import java.io.*;
import java.util.*;

public class Main {
    static class Person {
        int x;
        int y;

        public Person(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Person(x, y));
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                Person A = list.get(i);
                Person B = list.get(j);
                if (A.x < B.x && A.y < B.y) {
                    rank++;
                }
            }
            System.out.println(rank);
        }
    }
}
