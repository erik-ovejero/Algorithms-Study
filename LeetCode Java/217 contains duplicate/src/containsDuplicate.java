import java.util.HashSet;
/*
 * 217. Contains Duplicate:
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
    	
        HashSet<Integer> seen = new HashSet<>(); // we create a Hashset called seen
        for (int num : nums) { 
            if (seen.contains(num)) //checks if the number were in the array is already in the HashMap
                return true; // if it is, returns true
            seen.add(num); // otherwise it gets added to the seen Hashset
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution(); // make a new object of the class solution
        int[] nums = {1,2,3,1}; // Example 1
        System.out.println(solution.containsDuplicate(nums)); 
        int[] numsTwo = {1,2,3,4}; // Example 2
        System.out.println(solution.containsDuplicate(numsTwo)); 
        int[] numsThree = {1,1,1,3,3,4,3,2,4,2}; // Example 3
        System.out.println(solution.containsDuplicate(numsThree)); 
        
    }
}