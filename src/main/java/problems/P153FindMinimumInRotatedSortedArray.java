package problems;

public class P153FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        while (l < r) {
            mid = (l + r)/2;
            if(nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return nums[l];
    }
}
