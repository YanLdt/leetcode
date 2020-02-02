import java.util.Arrays;

/**
 * @Author: YanL
 * @Time: 10:47 2020/2/1
 * @Email: imyanl.dt@gmail.com
 * @Description: 暴力解法 遍历每一个元素，并查找是否存在目标值
 *
 * 时间复杂度 O(n^2)
 * 对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n) 的时间。因此时间复杂度为 O(n^2)。
 *
 * 空间复杂度 O(1)
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 7, 11}, 13);
        System.out.println(Arrays.toString(result));
    }
}
