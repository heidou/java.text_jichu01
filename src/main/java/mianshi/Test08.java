package mianshi;

/**
 * @author heidou.f
 *         2016/6/25.
 *         冒泡排序
 */
public class Test08 {
    public static void main(String[] args) {
        int[] numb = new int[]{23, 1, 34, 46, 12, 15};
        int leng = numb.length;
        System.out.println("排序前的数组各值");
        for (int i = 0; i < leng; i++) {
            System.out.print(numb[i] + "\t");
        }
        System.out.print("\n");
        swap(numb);
        System.out.println("数组排序后");
        for (int i = 0; i < leng; i++) {
            System.out.print(numb[i] + "\t");
        }
    }

    private static void swap(int[] numb) {
        int len = numb.length;
        int i, j;
        int temp;
        for (i = 1; i <= len; i++) {
            for (j = len - 1; j >= 1; j--) {
                if (numb[j] > numb[j - 1]) {
                    temp = numb[j];
                    numb[j] = numb[j - 1];
                    numb[j - 1] = temp;
                }
            }
        }
    }
}
