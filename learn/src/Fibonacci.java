/**
 * @Author 程序员小张
 * @Date 2023-02-15 23:32
 * @Desc
 */
public class Fibonacci {

    public int fib(int n) {
        int modNum = 1000000007;
        if (n < 2) {
            return n;
        }
        int p, q = 0, r = 1;
        for (int i = 2; i <= n; ++i) {
            p = q;
            q = r;
            r = (p + q) % modNum;
        }
        return r;
    }

}
