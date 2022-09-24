import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        int temp = -1;
        
        for (int i : arr) {
            if (temp != i) {
                list.add(i);
            }
            temp = i;
        }

        return list;
    }
}