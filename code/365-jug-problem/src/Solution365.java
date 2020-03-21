import java.util.*;

/**
 * @Author: YanL
 * @Time: 17:05 2020/3/21
 * @Email: imyanl.dt@gmail.com
 * @Description: 水桶问题的DFS解法：
 *                  在任意一个时刻，此问题的状态可以由两个数字决定：X 壶中的水量，以及 Y 壶中的水量。
 *                  深度优先搜索以每一次X，Y的值作为状态，每一步都尝试所有操作，
 *                  然后使用一个HashSet存储已经搜索过的状态
 */
public class Solution365 {
    public static boolean canMeasureWater(int x, int y, int z){
        //在栈中存储所有可能的状态
        Stack<int[]> stack = new Stack<>();
        //存储已经出现的状态
        Set<Map.Entry<Integer, Integer>> visited = new HashSet<>();
        stack.push(new int[]{0,0});
        while(!stack.empty()){
            int[] arr = stack.pop();
            if((arr[0] == z) || (arr[1] == z) || (arr[0] + arr[1] == z)){
                return true;
            }
            Map.Entry<Integer, Integer> curEntry = new AbstractMap.SimpleEntry<>(arr[0], arr[1]);
            if(visited.contains(curEntry)){
                continue;
            }
            //把当前状态添加到entry中
            visited.add(curEntry);
            //倒空X
            stack.push(new int[]{0, arr[1]});
            //倒空Y
            stack.push(new int[]{arr[0], 0});
            //X满
            stack.push(new int[]{x, arr[1]});
            //Y满
            stack.push(new int[]{arr[0], y});
            //x倒Y
            if(arr[0] + arr[1] < y){
                //没倒满Y
                stack.push(new int[]{0, arr[0] + arr[1]});
            }else{
                //倒满Y
                stack.push(new int[]{arr[0] + arr[1] - y, y});
            }
            //y倒X
            if(arr[0] + arr[1] < x){
                stack.push(new int[]{arr[0] + arr[1], 0});
            }else {
                stack.push(new int[]{x, arr[0] + arr[1] - x});
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(canMeasureWater(2, 6, 5));
    }
}
