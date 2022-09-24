class Solution {
    public int solution(String s) {
        int answer = 0;
        int mul = 1;
        
        if (s.charAt(0) == '-') {
            for (int i = s.length() - 1; i > 0; i--) {
                answer += (s.charAt(i) - '0') * mul;
                mul *= 10;
            }
            answer *= -1;
        } else if (s.charAt(0) == '+') {
            for (int i = s.length() - 1; i > 0; i--) {
                answer += (s.charAt(i) - '0') * mul;
                mul *= 10;
            }
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                answer += (s.charAt(i) - '0') * mul;
                mul *= 10;
            }
        }
        
        return answer;
    }
}