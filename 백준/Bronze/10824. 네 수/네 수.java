
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        System.out.println(Long.parseLong(str[0] + str[1]) + Long.parseLong(str[2] + str[3]));

        bw.flush();
        br.close();
        bw.close();
    }
}