import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: YanL
 * @Time: 9:20 2020/3/27
 * @Email: imyanl.dt@gmail.com
 * @Description: 最大公约数
 */
public class Solution914 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1,0,0,0};
        hasGroupsSizeX(arr);
    }
    public static boolean hasGroupsSizeX(int[] deck) {
        int[] res = new int[10000];
        for(int i = 0; i < deck.length; i++){
                res[deck[i]]++;
        }
        int g = -1;
        for(int i = 0; i < 10000; i++){
            if(res[i] > 0){
                if(g == -1){
                    g = res[i];
                }else{
                    g = gcd(g, res[i]);
                }
            }
        }

        return g > 2;
    }
    static int gcd(int x, int y){
        return x == 0 ? y : gcd(y % x, x);
    }
}
