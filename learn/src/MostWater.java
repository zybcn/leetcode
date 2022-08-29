/**
 * @Author 程序员小张
 * @Date 2022-08-29 21:43
 */
public class MostWater {

    /**
     * 双指针 求装最多的水
     */
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]) :
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }

}
