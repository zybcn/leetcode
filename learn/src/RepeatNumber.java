import java.util.HashSet;
import java.util.Set;

/**
 * @Author 程序员小张
 * @Date 2023-02-15 23:29
 * @Desc
 */
public class RepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        for (int num : nums) {
            if (dic.contains(num)) {
                return num;
            }
            dic.add(num);
        }
        return -1;
    }


}
