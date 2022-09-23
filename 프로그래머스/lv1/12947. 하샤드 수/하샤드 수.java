class Solution {
    public boolean solution(int x) {
        int temp = x;
        int add = 0;
        while (temp > 0) {
            add += temp % 10;
            temp /= 10;
        }

        if (x % add == 0) {
            return true;
        } else {
            return false;
        }
    }
}