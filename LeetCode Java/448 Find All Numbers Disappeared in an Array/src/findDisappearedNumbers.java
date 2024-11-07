import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/*
448. Find All Numbers Disappeared in an Array

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // we will store the unique numbers that appear in the array
        for (int val : nums) {  // Add each number in the input array to the set
        	set.add(val);       // the unique number is added to the set
        }
        ArrayList<Integer> list = new ArrayList<>(); // in this array we will store the missing numbers
        for (int i = 1; i<= nums.length;i++){ 
        	if (!set.contains(i)) { // if the number is not in the set we previously created...
        		list.add(i); // we add said number
        	}
        }
		return list;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution(); // make a new object of the class solution
        int[] nums = {1,1}; // Example 1
        System.out.println(solution.findDisappearedNumbers(nums)); 
        
}
}
