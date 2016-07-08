package stringbuffer;

/**
 * @author heidou.f
 *         2016/6/26.
 */
public class Test10 {
    public static void main(String[] args){
        int a[][]=new int[2][4];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=i;
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        }
}
