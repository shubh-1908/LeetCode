import java.util.*;
// solve
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int i = 0;
        for (int val : set) {
            nums[i++] = val;
        }
        return set.size();
    }
}
