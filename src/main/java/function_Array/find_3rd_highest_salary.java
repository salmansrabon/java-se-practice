package function_Array;
//3. Suppose, in a company , here are some employee salaries in an array
//[35000, 25000, 28000, 32500, 44000, 32800]
//Find out the 3rd highest salary

import java.util.Arrays;

public class find_3rd_highest_salary {
    public static void main(String[] args) {
        int[] nums={35000, 25000, 28000, 32500, 44000, 32800};
        Arrays.sort(nums);
        System.out.println(nums[nums.length-3]);
    }
}
