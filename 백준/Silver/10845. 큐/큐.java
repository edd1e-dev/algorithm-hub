

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static class Queue {
        private int[] queue = new int[10000];
        private int front = 0;
        private int rear = 0;

        void push(int num) {
            queue[rear++] = num;
        }

        int pop() {
            if (queue[front] == 0) return -1;

            int value = queue[front];
            queue[front++] = 0;
            return value;
        }

        int empty() {
            if (front == rear) return 1;
            else return 0;
        }

        int size() {
            return rear - front;
        }

        int front() {
            if (empty() == 1) {
                return -1;
            }
            return queue[front];
        }

        int back() {
            if (empty() == 1) {
                return -1;
            }
            return queue[rear - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        Queue queue = new Queue();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) {
                queue.push(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop")) {
                sb.append(queue.pop() + "\n");
            } else if (str.equals("front")) {
                sb.append(queue.front() + "\n");
            } else if (str.equals("back")) {
                sb.append(queue.back() + "\n");
            } else if (str.equals("size")) {
                sb.append(queue.size() + "\n");
            } else if (str.equals("empty")) {
                sb.append(queue.empty() + "\n");
            }
        }

        System.out.println(sb.toString());
    }
}
