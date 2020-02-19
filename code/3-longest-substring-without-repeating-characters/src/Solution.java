import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: YanL
 * @Time: 9:18 2020/2/16
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Solution {
    public int lengthOfLongestSubstring(String s){
        int n = s.length(), res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char c = s.charAt(end);
            if(map.containsKey(c)){
                start = Math.max(map.get(c), start);
            }
            res = Math.max(res, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}
