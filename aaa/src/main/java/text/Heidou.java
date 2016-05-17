package text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by heidou
 * 2016/5/8.
 * 利用内部类获取单例
 * 作用：保证单一类，线程安全，不占用资源
 * main -- Taa1
 */
public class Heidou {
    private static final Log log = LogFactory.getLog(Heidou.class);

    private Heidou(){
    }

    public void xf(){
        log.info("igig");
        log.error("tmi");
        log.debug("vgvg");  /**方法*/
    }

    public static Heidou getHeidouClient(){
        return HeidouHolder.heidou_Holder;
    }
    public static class HeidouHolder{
        private static Heidou heidou_Holder = new Heidou();  /**内部类**/
    }
}
