import java.util.HashMap;
import java.util.Map;

/**
 * @Author: YanL
 * @Time: 20:22 2020/2/6
 * @Email: imyanl.dt@gmail.com
 * @Description:
 *
 *  * 时间复杂度：O(n)，
 *  * 我们只遍历了包含有 n 个元素的列表一次。在表中进行的每次查找只花费 O(1) 的时间。
 *  *
 *  * 空间复杂度：O(n)，
 *  * 所需的额外空间取决于哈希表中存储的元素数量，该表最多需要存储 n 个元素。
 */
public class SolutionMap {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sum solution");
    }
}
