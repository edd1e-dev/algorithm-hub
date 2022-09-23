class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            return new int[] {-1};
        } 
        
        int min = 21470000;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        int[] newArr = new int[arr.length-1];
        int index = 0;
        for (int a : arr) {
            if (min != a) {
                newArr[index++] = a;
            }
        }
        
        return newArr;
    }
}