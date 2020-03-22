import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: YanL
 * @Time: 11:05 2020/3/22
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Solution945 {

    public static void main(String[] args) {
        System.out.println(minIncrementForUnique(new int[]{3,2,1,2,1,7}));
    }

    public static int minIncrementForUnique(int[] A){
        Arrays.sort(A);
        int move = 0;
        for(int i = 1; i < A.length; i++){
            if(A[i] <= A[i - 1]){
                int pre = A[i];
                A[i] = A[i - 1] + 1;
                move += A[i] - pre;
            }
        }
        return move;
    }
}
