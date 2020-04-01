import java.util.Arrays;
import java.util.Stack;

/**
 * @Author: YanL
 * @Time: 14:48 2020/4/1
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Solution1111 {

    public static void main(String[] args) {
        int[] res = maxDepthAfterSplit("()(())()");
        System.out.println(Arrays.toString(res));

    }


    public static int[] maxDepthAfterSplit(String seq){
//        Stack<Character> stack = new Stack<>();
        int len = seq.length();
        int[] res = new int[len];
        int count = 0;
        for(int i = 0; i < len; i++){
            if(seq.charAt(i) == '('){

                res[i] = count & 1;
                count += 1;

            }else{
                count -= 1;
                res[i] = count & 1;

            }
        }

        return res;
    }
}
