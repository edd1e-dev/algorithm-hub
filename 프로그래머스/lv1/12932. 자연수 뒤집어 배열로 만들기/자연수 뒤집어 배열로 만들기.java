class Solution {
    public int[] solution(long n) {
        if (n == 0) {
            return new int[] {0};
        }
        
        int size = 0;
        long temp = 0;
        while (n > 0) {
            temp = temp * 10;
            temp += n % 10;
            n /= 10;
            size++;
        }
        
        int[] answer = new int[size];
        
        int index = size - 1;
        while (index >= 0) {
            answer[index] = (int) (temp % 10);
            temp /= 10;
            index--;
        }
        
        return answer;
    }
}