package text_01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author heidou.f
 *         2016/5/17.
 *         输出此时日期
 */
public class Timu_01 {
    public static void main(String[] args){
        Date today = new Date();
        System.out.println(toDay(today,"yyyy-MM-dd"));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(calendar.DATE,1);
        Date tomorrow = calendar.getTime();
        System.out.println(toDay(tomorrow,"yyyy-MM-dd"));
    }
    public static String toDay(java.util.Date dt,String sFmt){
        if(null == dt || sFmt==null||" ".equals(sFmt)){
            return null;
        }
        SimpleDateFormat sdfFrom = null;
        String sRet = null;
        try{
            sdfFrom = new SimpleDateFormat(sFmt);
            sRet = sdfFrom.format(dt).toString();
        }catch (Exception ex){return null;
    }finally {
            sdfFrom = null;
        }
        return sRet;
        }

}
