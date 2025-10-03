package problems;

public class P268MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int expected = 0;
        int n = nums.length;
        for(int num: nums) {
            sum += num;
        }
        expected = n * (n+1) / 2;
        return expected - sum;
    }
}
