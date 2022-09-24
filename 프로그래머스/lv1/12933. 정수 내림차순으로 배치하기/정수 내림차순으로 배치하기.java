import java.util.*;

class Solution {
    public long solution(long n) {
        if (n == 0) {
            return 0;
        } else if (n > 1 && n < 10) {
            return n;
        }
        
        long answer = 0;
        long mul = 1;
        List<Integer> list = new ArrayList<>();
        
        while (n > 0) {
            list.add((int) (n % 10));
            n /= 10;
        }
        
        list.sort(Comparator.naturalOrder());
        
        System.out.println(list);
        
        while (list.size() > 0) {
            answer += (long) (list.get(0) * mul);
            mul *= 10;
            list.remove(0);
        }
        
        System.out.println(answer);
        
        return answer;
    }
}