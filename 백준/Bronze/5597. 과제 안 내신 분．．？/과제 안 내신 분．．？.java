
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[31];

        String str = "";
        while ((str = br.readLine()) != null) {
            arr[Integer.parseInt(str)] = true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) System.out.println(i);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}