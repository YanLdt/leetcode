/**
 * @Author: YanL
 * @Time: 9:50 2020/3/24
 * @Email: imyanl.dt@gmail.com
 * @Description: 动态规划
 * 递推方程：dp[i] = max(dp[i - 1], dp[i - 2] + nums[i])
 */
public class SolutionMassage {
    public static void main(String[] args) {
        System.out.println(massage(new int[]{1, 2, 3, 1}));
    }
    public static int massage(int[] nums) {
//        if(nums.length == 0){
//            return 0;
//        }
//        if(nums.length == 1){
//            return nums[0];
//        }
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0], nums[1]);

        //使用两个常数记录dp[i-1]和dp[i - 2]
        int a = 0, b = 0, res = 0;
        for(int i = 0; i < nums.length; i++){

//            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
            res = Math.max(b, a + nums[i]);
            a = b;
            b = res;
        }
        // return dp[nums.length-1];
        return res;
    }
}
