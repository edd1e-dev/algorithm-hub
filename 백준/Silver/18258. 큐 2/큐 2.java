
import java.io.*;
import java.util.*;

class Queue {
    static int[] queue = new int[2000000];
    static int front = 0;
    static int back = 0;
    static int size = 0;

    static void push(int n) {
        queue[back++] = n;
        size++;
    }

    static int pop() {
        if (size == 0) {
            return -1;
        }

        size--;
        int num = queue[front];
        front++;

        return num;
    }

    static int size() {
        return size;
    }

    static int empty() {
        if (size == 0) {
            return 1;
        }

        return 0;
    }

    static int front() {
        if (size == 0) {
            return -1;
        }

        return queue[front];
    }

    static int back() {
        if (size == 0) {
            return -1;
        }

        return queue[back - 1];
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Queue queue = new Queue();
        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();;

            if (command.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                queue.push(num);
            } else if (command.equals("pop")) {
                sb.append(queue.pop() + "\n");
            } else if (command.equals("size")) {
                sb.append(queue.size() + "\n");
            } else if (command.equals("empty")) {
                sb.append(queue.empty() + "\n");
            } else if (command.equals("front")) {
                sb.append(queue.front() + "\n");
            } else if (command.equals("back")) {
                sb.append(queue.back() + "\n");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}