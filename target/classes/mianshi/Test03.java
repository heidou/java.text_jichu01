package mianshi;

/**
 * @author heidou.f
 *         2016/5/13.
 */
public class Test03 {

        public static int staticVar = 0;
        public int instanceVar = 0;
        public Test03() {
            staticVar++;
            instanceVar++;
            System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
        }
    }
