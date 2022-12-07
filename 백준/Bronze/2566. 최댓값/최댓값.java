
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[10][10];

        String str = "";
        int column = 1;
        int max = Integer.MIN_VALUE;
        int i = -1;
        int j = -1;
        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            int row = 1;
            while (st.hasMoreTokens()) {
                arr[column][row] = Integer.parseInt(st.nextToken());
                if (max < arr[column][row]) {
                    max = arr[column][row];
                    i = column;
                    j = row;
                }
                row++;
            }
            column++;

            if (column == 10) break;
        }

        System.out.println(max);
        System.out.println(i + " " + j);

        bw.flush();
        br.close();
        bw.close();
    }
}