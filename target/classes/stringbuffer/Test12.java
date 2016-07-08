package stringbuffer;

/**
 * @author heidou.f
 *         2016/6/27.
 */
public class Test12{
    public static void main(String[] args){
        int i=1,j=10;
        do {
            if (i++>--j)continue;
        }while (i<5);
        System.out.println(i+"."+j);
    }
}
/**过程：
 i=1j=10，j-1=9, 1<9跳出if i+1=2 去while
 i<5 去do
 i=2j=9，j-1=8，2<8跳出if i+1=3 去while
 i<5 去do
 i=3j=8 j-1=7 3<7 跳出if i=4 去while
 i<5 去do
 i=4j=7 j-1=6 4<7 跳出if i=5 去while
 i=5 结束循环 最后输出
 此时i=5 j=6 */