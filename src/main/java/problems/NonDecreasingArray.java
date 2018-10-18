package problems;
import java.util.ArrayList;
// https://leetcode.com/problems/non-decreasing-array/description/

class NonDecreasingArray {

    public static void main(String[] args){
        int[] nums = {5. 3. 4. 6};
        NonDecreasingArray.decreasingIndexes()
    }
    public boolean checkPossibility(int[] nums) {
        if (decreasingIndexes(nums)) return true;
        for (int i = 0; i < nums.length; i++) {

        }
    }

    public static List<Integer> decreasingIndexes(int[] nums) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                indexes.add(i);
            }
            return indexes;
        }
    }
}