
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // A진법 2 <= A <= 30
        int B = Integer.parseInt(st.nextToken()); // B진법

        int m = Integer.parseInt(br.readLine()); // A진법으로 나타낸 숫자 자릿수 1 <= m <= 25

        st = new StringTokenizer(br.readLine());

        int ten = 0;
        while (m-- > 0) {
            if (m > 0) {
                ten += Integer.parseInt(st.nextToken()) * Math.pow(A, m);
            } else {
                ten += Integer.parseInt(st.nextToken());
            }
        }

        int after = ten;
        List<Integer> list = new ArrayList<>();

        while (after > 0) {
            list.add(after % B);
            after /= B;
        }

        for (int i = list.size() - 1; i >= 0; ) {
            System.out.print(list.get(i));
            if (--i >= 0) {
                System.out.print(" ");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}