
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static class Deque {
        int[] deque = new int[10000];
        int front = 0;
        int rear = 0;
        int size = 0;

        void push_front(int num) {
            deque[front] = num;
            front = (front - 1 + 10000) % 10000; // 음수 방지
            size++;
        }

        void push_back(int num) {
            rear = (rear + 1) % 10000;
            size++;
            deque[rear] = num;
        }

        int pop_front() {
            if (empty() == 1) {
                return -1;
            }
            
            front = (front + 1) % 10000;
            size--;

            return deque[front];
        }

        int pop_back() {
            if (empty() == 1) {
                return -1;
            }

            int data = deque[rear];
            rear = (rear - 1 + 10000) % 10000;
            size--;

            return data;
        }

        int size() {
            return size;
        }

        int empty() {
            if (size == 0) return 1;
            else return 0;
        }

        int front() {
            if (size == 0) return -1;

            return deque[(front + 1) % 10000];
        }

        int back() {
            if (size == 0) return -1;

            return deque[rear];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque deque = new Deque();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push_front")) {
                deque.push_front(Integer.parseInt(st.nextToken()));
            } else if (s.equals("push_back")) {
                deque.push_back(Integer.parseInt(st.nextToken()));
            } else if (s.equals("pop_front")) {
                System.out.println(deque.pop_front());
            } else if (s.equals("pop_back")) {
                System.out.println(deque.pop_back());
            } else if (s.equals("front")) {
                System.out.println(deque.front());
            } else if (s.equals("back")) {
                System.out.println(deque.back());
            } else if (s.equals("size")) {
                System.out.println(deque.size());
            } else if (s.equals("empty")) {
                System.out.println(deque.empty());
            }
        }
    }
}
