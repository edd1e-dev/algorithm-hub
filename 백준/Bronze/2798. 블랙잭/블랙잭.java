import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int temp = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j=i+1; j < N-1; j++) {
                for (int k=j+1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (temp < sum && sum <= M) {
                        temp = sum;
                    }
                }
            }
        }

        System.out.println(temp);
    }
}
