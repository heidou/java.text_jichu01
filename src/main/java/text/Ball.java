package text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by heidou
 * 2016/5/8.
 * 定义抽象类  抽象类不能进行实例化必须被子类继承
 */
public abstract class Ball {
    private static final Log log = LogFactory.getLog(Ball.class);

    /**
     * 日志*
     */
    public void execute() {
        System.out.println("1212");
    }

    public abstract void play();/**抽象类方法**/
}
