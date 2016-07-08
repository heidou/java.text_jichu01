package mianshi;

/**
 * @author heidou.f
 *         2016/6/24.
 *         打出菱形
 */
public class Test06 {
    public static void main(String[] args) {
        int m = 7;
        for (int i = 0; i < m; i++) {
            int t = 0;
            if (i >= m / 2) {
                t = m - 1 - i;
            } else {
                t = i;
            }
            for (int j = 1; j <= m; j++) {
                if (j >= (m + 1) / 2 - t && j <= (m + 1) / 2 + t) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}